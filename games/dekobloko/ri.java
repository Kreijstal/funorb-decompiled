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
        int var4 = 0;
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
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = ha.a(param2, (byte) -126);
              if (rk.field_K == null) {
                rk.field_K = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  L4: {
                    if (null == ef.field_R) {
                      break L4;
                    } else {
                      if (var7_int > ef.field_R.field_r.length) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ef.field_R = new wl(var7_int);
                  break L3;
                }
                ef.field_R.field_n = 0;
                L5: {
                  L6: {
                    ef.field_R.a(false, param2, param6, 0);
                    ef.field_R.e(102, var7_int);
                    ef.field_R.a((byte) -105, var15);
                    if (ba.field_b == null) {
                      break L6;
                    } else {
                      if (100 <= ba.field_b.field_r.length) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ba.field_b = new wl(100);
                  break L5;
                }
                ba.field_b.field_n = 0;
                ba.field_b.a(true, 10);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (4 <= var11) {
                    ba.field_b.d(-1, param2);
                    ba.field_b.a(param4, param3, true);
                    param5.a(false, ba.field_b.field_n, ba.field_b.field_r, 0);
                    param5.a(false, ef.field_R.field_n, ef.field_R.field_r, 0);
                    break L0;
                  } else {
                    ba.field_b.a(var15[var11], false);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = rk.field_K.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var7);
            stackOut_22_1 = new StringBuilder().append("ri.B(").append(0).append(',').append(115).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param6 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    final ql c(int param0) {
        boolean discarded$1 = false;
        ql var2 = null;
        if (param0 != 27134) {
          L0: {
            discarded$1 = ri.a(-14);
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
        int fieldTemp$1 = 0;
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
            fieldTemp$1 = this.field_u - 1;
            this.field_u = this.field_u - 1;
            if (fieldTemp$1 > 0) {
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
            if (de.field_M < this.field_m) {
              qd.field_Rb = (this.field_m + -de.field_M) / 2;
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
              if (this.field_m > 0) {
                qd.field_Rb = 0;
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
              } else {
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
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        var2 = this.field_m;
        var3 = this.field_h;
        if (this.b(0)) {
          L0: {
            if (var2 > this.field_a) {
              var2 = this.field_a;
              break L0;
            } else {
              if (var2 < this.field_l) {
                var2 = this.field_l;
                break L0;
              } else {
                break L0;
              }
            }
          }
          if (var3 > this.field_c) {
            L1: {
              var3 = this.field_c;
              if (0.0f >= this.field_d) {
                break L1;
              } else {
                var4 = (int)((float)var3 * this.field_d + 0.5f);
                if (var4 <= var2) {
                  if (var2 <= var4) {
                    break L1;
                  } else {
                    var2 = var4;
                    break L1;
                  }
                } else {
                  var3 = (int)((float)var2 / this.field_d);
                  if (de.field_M != var2) {
                    L2: {
                      this.field_t.a(-4328, var3, var2);
                      if (this.field_m <= 0) {
                        break L2;
                      } else {
                        qd.field_Rb = (this.field_m + -de.field_M) / 2;
                        break L2;
                      }
                    }
                    return;
                  } else {
                    if (ob.field_g == var3) {
                      if (this.field_m > 0) {
                        qd.field_Rb = (this.field_m + -de.field_M) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_t.a(-4328, var3, var2);
                      if (this.field_m > 0) {
                        qd.field_Rb = (this.field_m + -de.field_M) / 2;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            if (de.field_M != var2) {
              this.field_t.a(-4328, var3, var2);
              if (this.field_m > 0) {
                qd.field_Rb = (this.field_m + -de.field_M) / 2;
                return;
              } else {
                return;
              }
            } else {
              if (ob.field_g == var3) {
                if (this.field_m > 0) {
                  qd.field_Rb = (this.field_m + -de.field_M) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_t.a(-4328, var3, var2);
                if (this.field_m > 0) {
                  qd.field_Rb = (this.field_m + -de.field_M) / 2;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (this.field_b > var3) {
              L3: {
                var3 = this.field_b;
                if (0.0f >= this.field_d) {
                  break L3;
                } else {
                  var4 = (int)((float)var3 * this.field_d + 0.5f);
                  if (var4 <= var2) {
                    if (var2 <= var4) {
                      break L3;
                    } else {
                      var2 = var4;
                      break L3;
                    }
                  } else {
                    var3 = (int)((float)var2 / this.field_d);
                    break L3;
                  }
                }
              }
              L4: {
                if (de.field_M != var2) {
                  this.field_t.a(-4328, var3, var2);
                  break L4;
                } else {
                  if (ob.field_g == var3) {
                    break L4;
                  } else {
                    this.field_t.a(-4328, var3, var2);
                    break L4;
                  }
                }
              }
              if (this.field_m > 0) {
                qd.field_Rb = (this.field_m + -de.field_M) / 2;
                return;
              } else {
                return;
              }
            } else {
              if (0.0f < this.field_d) {
                L5: {
                  var4 = (int)((float)var3 * this.field_d + 0.5f);
                  if (var4 <= var2) {
                    if (var2 <= var4) {
                      break L5;
                    } else {
                      var2 = var4;
                      break L5;
                    }
                  } else {
                    var3 = (int)((float)var2 / this.field_d);
                    break L5;
                  }
                }
                if (de.field_M == var2) {
                  if (ob.field_g == var3) {
                    L6: {
                      if (this.field_m <= 0) {
                        break L6;
                      } else {
                        qd.field_Rb = (this.field_m + -de.field_M) / 2;
                        break L6;
                      }
                    }
                    return;
                  } else {
                    this.field_t.a(-4328, var3, var2);
                    L7: {
                      if (this.field_m <= 0) {
                        break L7;
                      } else {
                        qd.field_Rb = (this.field_m + -de.field_M) / 2;
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  this.field_t.a(-4328, var3, var2);
                  L8: {
                    if (this.field_m <= 0) {
                      break L8;
                    } else {
                      qd.field_Rb = (this.field_m + -de.field_M) / 2;
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  if (de.field_M != var2) {
                    this.field_t.a(-4328, var3, var2);
                    break L9;
                  } else {
                    if (ob.field_g == var3) {
                      break L9;
                    } else {
                      this.field_t.a(-4328, var3, var2);
                      break L9;
                    }
                  }
                }
                L10: {
                  if (this.field_m <= 0) {
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
        } else {
          this.field_q = false;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (80 <= param1) {
                stackOut_3_0 = 54;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param1 / 20 * 18;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7_int = stackIn_4_0;
              var8 = 0;
              if (param1 >= 60) {
                if (param1 < 80) {
                  var7_int = var7_int + vl.a(23841, 80, 40 + param5 * 18);
                  break L2;
                } else {
                  if (param1 >= 93) {
                    hk.a(-30 + param4, 54 + param0 + -2, 60, 40, 4, 65280, 100);
                    break L2;
                  } else {
                    var8 = vl.a(23841, 80, 40 + ve.field_ic[1 + param1 - 80] * 18);
                    break L2;
                  }
                }
              } else {
                var7_int = var7_int + vl.a(23841, 80, param2 * 18 + 40);
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if (var9 >= 3) {
                fb.field_c[0][1].c(param4 + 9, var8 + var7_int + param0, 18, -var8 + 18);
                break L0;
              } else {
                fb.field_c[0][1].c(var9 * 18 + -27 + param4, 72 + param0, 18, 18);
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var7), "ri.G(" + param0 + ',' + param1 + ',' + param2 + ',' + -115 + ',' + param4 + ',' + param5 + ',' + 0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
            if (~var6 == param2) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L1;
            } else {
              stackOut_17_0 = param1 * 1000 / var6;
              stackIn_19_0 = stackOut_17_0;
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
            if (~var6 == param2) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            } else {
              stackOut_5_0 = param1 * 1000 / var6;
              stackIn_7_0 = stackOut_5_0;
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
        ql discarded$0 = null;
        this.field_h = param2;
        this.field_m = param0;
        if (param1) {
            discarded$0 = this.c(-56);
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
