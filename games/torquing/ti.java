/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    private ja field_d;
    static uf[] field_l;
    static String field_m;
    private int field_j;
    static boolean field_k;
    private long[] field_n;
    int[] field_b;
    static String field_f;
    int[] field_h;
    private boolean field_i;
    static uh field_e;
    int field_c;
    private ei field_o;
    static int field_g;
    int[] field_a;

    final ec a(int param0, int param1, ec param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        ja stackIn_6_1 = null;
        ja stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        ja stackOut_5_1 = null;
        Object stackOut_4_0 = null;
        ja stackOut_4_1 = null;
        ja stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_d) {
                  break L2;
                } else {
                  if (!this.field_i) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (2 != this.field_j) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = ja.a(this.field_n, param2, param1);
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = ja.a(param2, param1);
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L3;
                }
              }
              ((ti) (this)).field_d = stackIn_6_1;
              this.field_i = true;
              break L1;
            }
            var4_int = 26 % ((param0 - 75) / 41);
            stackOut_7_0 = this.field_d;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("ti.F(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return (ec) ((Object) stackIn_8_0);
    }

    final void a(lm param0, int param1) {
        ud var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
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
        var4 = Torquing.field_u;
        try {
          L0: {
            var3 = (ud) ((Object) this.field_o.b(param1 ^ param1));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (param0.a(var3.field_m)) {
                    L3: {
                      var3.f(0);
                      if (var3.field_o == null) {
                        break L3;
                      } else {
                        je.a((byte) -43, var3.field_o);
                        break L3;
                      }
                    }
                    L4: {
                      if (null != this.field_n) {
                        je.a((byte) -43, this.field_n);
                        this.field_n = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    this.field_j = -1;
                    this.b((byte) 62);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var3 = (ud) ((Object) this.field_o.f(-24059));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("ti.B(");
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
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final ec a(int param0, int param1) {
        ec discarded$6 = null;
        ec discarded$7 = null;
        ec discarded$8 = null;
        if (null == this.field_d) {
          this.field_d = ja.a(this.field_n, param0);
          this.field_i = false;
          if (param1 < -41) {
            return (ec) ((Object) this.field_d);
          } else {
            discarded$6 = this.a(126, -79);
            return (ec) ((Object) this.field_d);
          }
        } else {
          if (!this.field_i) {
            if (param1 >= -41) {
              discarded$7 = this.a(126, -79);
              return (ec) ((Object) this.field_d);
            } else {
              return (ec) ((Object) this.field_d);
            }
          } else {
            this.field_d = ja.a(this.field_n, param0);
            this.field_i = false;
            if (param1 < -41) {
              return (ec) ((Object) this.field_d);
            } else {
              discarded$8 = this.a(126, -79);
              return (ec) ((Object) this.field_d);
            }
          }
        }
    }

    final ti c(byte param0) {
        ti discarded$10 = null;
        ti var2 = null;
        ud var3 = null;
        int var4 = 0;
        var4 = Torquing.field_u;
        var2 = new ti(this.field_b, this.field_h, this.field_a, this.field_c);
        var3 = (ud) ((Object) this.field_o.b(0));
        L0: while (true) {
          if (var3 == null) {
            if (param0 < 54) {
              L1: {
                discarded$10 = this.c((byte) -48);
                if (null != this.field_n) {
                  var2.field_n = ee.b(-114);
                  dk.a(this.field_n, 0, var2.field_n, 0, this.field_n.length);
                  break L1;
                } else {
                  break L1;
                }
              }
              var2.field_j = this.field_j;
              return var2;
            } else {
              L2: {
                if (null != this.field_n) {
                  var2.field_n = ee.b(-114);
                  dk.a(this.field_n, 0, var2.field_n, 0, this.field_n.length);
                  break L2;
                } else {
                  break L2;
                }
              }
              var2.field_j = this.field_j;
              return var2;
            }
          } else {
            var2.field_o.a((byte) 54, var3.a(true, var2));
            var3 = (ud) ((Object) this.field_o.f(-24059));
            continue L0;
          }
        }
    }

    private final void c(int param0) {
        ec discarded$2 = null;
        ec discarded$3 = null;
        Object var2 = null;
        ud var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var2 = null;
        var4 = Torquing.field_u;
        if (null == this.field_n) {
          this.field_j = -1;
          var2_ref = (ud) ((Object) this.field_o.b(0));
          L0: while (true) {
            if (var2_ref == null) {
              if (param0 == 4803) {
                return;
              } else {
                discarded$2 = this.a(-93, 64);
                return;
              }
            } else {
              L1: {
                L2: {
                  if (var2_ref.field_o != null) {
                    break L2;
                  } else {
                    var2_ref.a(param0 + -4682);
                    if (var2_ref.field_p) {
                      je.a((byte) -43, var2_ref.field_o);
                      var2_ref.f(param0 ^ 4803);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.field_n == null) {
                  this.field_n = ee.b(-123);
                  dk.a(var2_ref.field_o, 0, this.field_n, 0, 64);
                  break L1;
                } else {
                  var3 = 0;
                  L3: while (true) {
                    if (-65 >= (var3 ^ -1)) {
                      break L1;
                    } else {
                      this.field_n[var3] = ee.a(this.field_n[var3], var2_ref.field_o[var3]);
                      var3++;
                      continue L3;
                    }
                  }
                }
              }
              var2_ref = (ud) ((Object) this.field_o.f(-24059));
              continue L0;
            }
          }
        } else {
          je.a((byte) -43, this.field_n);
          this.field_n = null;
          this.field_j = -1;
          var2_ref = (ud) ((Object) this.field_o.b(0));
          L4: while (true) {
            if (var2_ref == null) {
              if (param0 == 4803) {
                return;
              } else {
                discarded$3 = this.a(-93, 64);
                return;
              }
            } else {
              L5: {
                L6: {
                  if (var2_ref.field_o != null) {
                    break L6;
                  } else {
                    var2_ref.a(param0 + -4682);
                    if (var2_ref.field_p) {
                      je.a((byte) -43, var2_ref.field_o);
                      var2_ref.f(param0 ^ 4803);
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (this.field_n == null) {
                  this.field_n = ee.b(-123);
                  dk.a(var2_ref.field_o, 0, this.field_n, 0, 64);
                  break L5;
                } else {
                  var3 = 0;
                  L7: while (true) {
                    if (-65 >= (var3 ^ -1)) {
                      break L5;
                    } else {
                      this.field_n[var3] = ee.a(this.field_n[var3], var2_ref.field_o[var3]);
                      var3++;
                      continue L7;
                    }
                  }
                }
              }
              var2_ref = (ud) ((Object) this.field_o.f(-24059));
              continue L4;
            }
          }
        }
    }

    final static void a(la param0, int param1) {
        ho var2 = null;
        gg discarded$0 = null;
        try {
            ho.a(param0.a(-125, "", "headers.packvorbis"));
            if (param1 != 28922) {
                ti.a(true);
            }
            var2 = ho.a(param0, "jagex logo2.packvorbis", "");
            discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ti.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        if (param0 != 1) {
            return;
        }
        re.field_e = kj.field_d.h((byte) 113);
        CharSequence var2 = (CharSequence) ((Object) re.field_e);
        tj.field_j = hf.a(var2, 112);
    }

    final void a(boolean param0, lm param1) {
        int var4 = Torquing.field_u;
        if (-3 == (this.field_j ^ -1)) {
            if ((this.field_o.a(false) ^ -1) == -2) {
                if (((ud) ((Object) this.field_o.b(0))).field_m == null) {
                    return;
                }
            }
        }
        ud var3 = (ud) ((Object) this.field_o.b(0));
        while (var3 != null) {
            if (!(!param1.a(var3.field_m))) {
                return;
            }
            var3 = (ud) ((Object) this.field_o.f(-24059));
        }
        this.field_o.a((byte) 54, new ud((ti) (this), param1));
        if (!(null == this.field_n)) {
            je.a((byte) -43, this.field_n);
            this.field_n = null;
        }
        if (!param0) {
            return;
        }
        try {
            this.b((byte) 62);
            this.field_j = -1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ti.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        if (param0 != 62) {
          L0: {
            field_k = false;
            if (this.field_d != null) {
              this.field_d.b();
              break L0;
            } else {
              break L0;
            }
          }
          this.field_d = null;
          return;
        } else {
          L1: {
            if (this.field_d != null) {
              this.field_d.b();
              break L1;
            } else {
              break L1;
            }
          }
          this.field_d = null;
          return;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_l = null;
        field_e = null;
        if (param0) {
            return;
        }
        field_m = null;
    }

    final boolean a(int param0) {
        long[] var2 = null;
        Object var3 = null;
        ud var3_ref = null;
        int var4 = 0;
        long[] var5 = null;
        L0: {
          var3 = null;
          var4 = Torquing.field_u;
          if (param0 == -3) {
            break L0;
          } else {
            this.b((byte) -91);
            break L0;
          }
        }
        if (1 < this.field_o.a(false)) {
          var5 = ((ud) ((Object) this.field_o.b(0))).field_o;
          var2 = var5;
          dk.a(this.field_n, 0, var5, 0, 64);
          var3_ref = (ud) ((Object) this.field_o.b(0));
          L1: while (true) {
            if (var3_ref == null) {
              this.field_o.a(0);
              this.field_o.a((byte) 54, new ud(var5));
              return true;
            } else {
              L2: {
                if (null == var3_ref.field_o) {
                  break L2;
                } else {
                  if (var3_ref.field_o != var5) {
                    je.a((byte) -43, var3_ref.field_o);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var3_ref = (ud) ((Object) this.field_o.f(-24059));
              continue L1;
            }
          }
        } else {
          return false;
        }
    }

    ti(int[] param0, int[] param1, int[] param2, int param3) {
        this.field_j = -1;
        try {
            this.field_b = param0;
            this.field_h = param1;
            this.field_a = param2;
            this.field_c = param3;
            this.field_o = new ei();
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int a(byte param0) {
        int discarded$1 = 0;
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = Torquing.field_u;
        if (0 == (this.field_j ^ -1)) {
          L0: {
            if (null != this.field_n) {
              break L0;
            } else {
              this.c(4803);
              break L0;
            }
          }
          if (this.field_o.a(false) == 0) {
            this.field_j = 0;
            return this.field_j;
          } else {
            var2 = 6;
            L1: while (true) {
              if (57 < var2) {
                this.field_j = 2;
                if (param0 > 82) {
                  return this.field_j;
                } else {
                  discarded$1 = this.a((byte) 76);
                  return this.field_j;
                }
              } else {
                L2: {
                  var5 = this.field_c;
                  if (-1 == (var5 ^ -1)) {
                    var3 = 144115188075855872L - (1L << -1 + var2);
                    break L2;
                  } else {
                    if (var5 != 1) {
                      if ((var5 ^ -1) != -3) {
                        if (var5 == 3) {
                          var3 = -32L + (1L << var2);
                          break L2;
                        } else {
                          var3 = 0L;
                          break L2;
                        }
                      } else {
                        var3 = (1L << var2 + -6 + 1) + -1L << 63 - var2;
                        break L2;
                      }
                    } else {
                      var3 = -32L + (1L << -var2 + 63);
                      break L2;
                    }
                  }
                }
                if ((this.field_n[var2] & var3) == var3) {
                  var2++;
                  continue L1;
                } else {
                  this.field_j = 1;
                  return this.field_j;
                }
              }
            }
          }
        } else {
          return this.field_j;
        }
    }

    static {
        field_m = "Create a free account to start using this feature";
        field_f = "Create a free account to store your progress.";
        field_k = false;
    }
}
