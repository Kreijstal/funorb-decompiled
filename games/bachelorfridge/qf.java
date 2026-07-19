/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends ida {
    static cw field_y;
    static String field_w;
    static int field_v;
    private int field_C;
    static String[] field_A;
    static be[] field_x;
    private cq field_u;
    private int field_z;
    private boolean field_B;
    private int field_t;

    private final void a(int param0, aga param1, int param2, boolean param3, int param4) {
        ad var6 = null;
        boolean discarded$0 = false;
        try {
            var6 = this.field_s.b(param1, -23990);
            var6.field_s.field_s = param2;
            super.a(param2, param4, 27230);
            this.field_n = -50;
            if (param0 != 0) {
                discarded$0 = this.c((byte) -81);
            }
            this.a(param1, param3, -3670);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qf.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(aga param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
              var4_int = 10;
              if ((param0.field_y ^ -1) == -18) {
                var4_int = 15;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (28 != param0.field_y) {
                break L2;
              } else {
                var4_int = 20;
                break L2;
              }
            }
            L3: {
              this.field_q = wka.a(57, this.field_C, var4_int, this.field_r);
              this.field_z = this.field_q;
              if (param2 == -3670) {
                break L3;
              } else {
                field_A = (String[]) null;
                break L3;
              }
            }
            L4: {
              if (!param1) {
                break L4;
              } else {
                this.field_q = this.field_q + wka.a(57, this.field_C, var4_int, 1);
                break L4;
              }
            }
            if (this.field_z == 0) {
              this.field_z = 10;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("qf.L(");
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
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean c(byte param0) {
        ad var2 = null;
        int var3 = 0;
        je var4_ref_je = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ad var7 = null;
        var6 = BachelorFridge.field_y;
        var7 = this.field_p.a(-27449, this.field_s);
        var3 = -27 % ((71 - param0) / 47);
        int fieldTemp$1 = this.field_n + 1;
        this.field_n = this.field_n + 1;
        if (fieldTemp$1 < 0) {
          return false;
        } else {
          L0: {
            if (null != this.field_u) {
              break L0;
            } else {
              if ((var7.field_s.field_y ^ -1) != -33) {
                break L0;
              } else {
                var4_ref_je = je.a(rt.field_a[32], 256, 256);
                var4_ref_je.d(-1);
                this.field_u = tw.a(var4_ref_je, (byte) -36);
                break L0;
              }
            }
          }
          if (0 == this.field_n) {
            if (!this.field_B) {
              L1: {
                if (32 == var7.field_s.field_y) {
                  break L1;
                } else {
                  var7.b(-1, this.field_t);
                  break L1;
                }
              }
              this.field_s.field_s.a(var7, 107);
              if (this.field_q >= this.field_n) {
                if (this.field_z >= this.field_n) {
                  var4 = this.field_n + -this.field_m;
                  var2 = this.field_p.a(-27449, this.field_s);
                  var2.field_o = (this.field_l << -781104688) * var4 / this.field_z;
                  var2.field_r = var4 * (this.field_j << -82866704) / this.field_z;
                  return false;
                } else {
                  L2: {
                    var2 = this.field_p.a(-27449, this.field_s);
                    var4 = this.field_q - this.field_z >> 1995928513;
                    var5 = -this.field_n + -var4 + this.field_q;
                    if (0 <= var5) {
                      break L2;
                    } else {
                      var5 = -var5;
                      break L2;
                    }
                  }
                  var5 = this.field_q + (-var4 - var5);
                  var2.field_r = (this.field_j << -1546837168) * var5 / this.field_z;
                  var2.field_o = (this.field_l << -692659344) * var5 / this.field_z;
                  return false;
                }
              } else {
                this.c(true);
                return true;
              }
            } else {
              this.field_s.field_s.a(var7, 107);
              if (this.field_q >= this.field_n) {
                if (this.field_z >= this.field_n) {
                  var4 = this.field_n + -this.field_m;
                  var2 = this.field_p.a(-27449, this.field_s);
                  var2.field_o = (this.field_l << -781104688) * var4 / this.field_z;
                  var2.field_r = var4 * (this.field_j << -82866704) / this.field_z;
                  return false;
                } else {
                  L3: {
                    var2 = this.field_p.a(-27449, this.field_s);
                    var4 = this.field_q - this.field_z >> 1995928513;
                    var5 = -this.field_n + -var4 + this.field_q;
                    if (0 <= var5) {
                      break L3;
                    } else {
                      var5 = -var5;
                      break L3;
                    }
                  }
                  var5 = this.field_q + (-var4 - var5);
                  var2.field_r = (this.field_j << -1546837168) * var5 / this.field_z;
                  var2.field_o = (this.field_l << -692659344) * var5 / this.field_z;
                  return false;
                }
              } else {
                this.c(true);
                return true;
              }
            }
          } else {
            this.field_s.field_s.a(var7, 107);
            if (this.field_q >= this.field_n) {
              if (this.field_z >= this.field_n) {
                var4 = this.field_n + -this.field_m;
                var2 = this.field_p.a(-27449, this.field_s);
                var2.field_o = (this.field_l << -781104688) * var4 / this.field_z;
                var2.field_r = var4 * (this.field_j << -82866704) / this.field_z;
                return false;
              } else {
                L4: {
                  var2 = this.field_p.a(-27449, this.field_s);
                  var4 = this.field_q - this.field_z >> 1995928513;
                  var5 = -this.field_n + -var4 + this.field_q;
                  if (0 <= var5) {
                    break L4;
                  } else {
                    var5 = -var5;
                    break L4;
                  }
                }
                var5 = this.field_q + (-var4 - var5);
                var2.field_r = (this.field_j << -1546837168) * var5 / this.field_z;
                var2.field_o = (this.field_l << -692659344) * var5 / this.field_z;
                return false;
              }
            } else {
              this.c(true);
              return true;
            }
          }
        }
    }

    private final void c(boolean param0) {
        ad var2 = null;
        ad var3 = null;
        L0: {
          var3 = this.field_p.a(-27449, this.field_s);
          var2 = var3;
          var3.b(false);
          var3.field_r = 0;
          var3.field_o = 0;
          var3.field_k = 0;
          if (null != this.field_u) {
            id.a(72, this.field_u);
            break L0;
          } else {
            break L0;
          }
        }
        if (123 == this.field_C) {
          this.field_s.b(var3, (ad) null, param0);
          if (param0) {
            var3.field_s.field_s = this.field_k;
            if (hl.a((byte) -124, this.field_C)) {
              if (!var3.field_s.g((byte) 85)) {
                if (var3.field_s.field_y != 33) {
                  if (var3.field_s.field_y == 31) {
                    return;
                  } else {
                    this.field_s.a(-16007, var3, 2);
                    var3.field_s.field_C = var3.field_s.field_C - 1;
                    return;
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
            this.field_B = false;
            var3.field_s.field_s = this.field_k;
            if (hl.a((byte) -124, this.field_C)) {
              if (!var3.field_s.g((byte) 85)) {
                if (var3.field_s.field_y != 33) {
                  if (var3.field_s.field_y == 31) {
                    return;
                  } else {
                    this.field_s.a(-16007, var3, 2);
                    var3.field_s.field_C = var3.field_s.field_C - 1;
                    return;
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
        } else {
          this.field_s.a(-119, this.field_r, var3, this.field_k);
          if (!param0) {
            this.field_B = false;
            var3.field_s.field_s = this.field_k;
            if (hl.a((byte) -124, this.field_C)) {
              if (!var3.field_s.g((byte) 85)) {
                if (var3.field_s.field_y != 33) {
                  if (var3.field_s.field_y != 31) {
                    this.field_s.a(-16007, var3, 2);
                    var3.field_s.field_C = var3.field_s.field_C - 1;
                    return;
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
              return;
            }
          } else {
            var3.field_s.field_s = this.field_k;
            if (hl.a((byte) -124, this.field_C)) {
              if (!var3.field_s.g((byte) 85)) {
                if (var3.field_s.field_y != 33) {
                  if (var3.field_s.field_y != 31) {
                    this.field_s.a(-16007, var3, 2);
                    var3.field_s.field_C = var3.field_s.field_C - 1;
                    return;
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
              return;
            }
          }
        }
    }

    qf(gj param0, df param1) {
        this(param0, param1.field_l, param1.field_k, param1.field_p, param1.field_n, param1.field_t);
        ad var3 = null;
        try {
            var3 = this.field_p.a(-27449, this.field_s);
            var3.field_s.d(param1.field_k, (byte) -115);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    qf(gj param0, nq param1, int param2, int param3, int param4, boolean param5) {
        super(param0, param1, param3, param4);
        RuntimeException var7 = null;
        ad var8 = null;
        aga var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
              var10 = this.field_p.a(114, this.field_s.field_h);
              var8 = this.field_s.b(var10, -23990);
              this.field_C = param2;
              if (this.field_C == 0) {
                this.field_t = 1;
                break L1;
              } else {
                if (hl.a((byte) -49, this.field_C)) {
                  this.field_t = 3;
                  break L1;
                } else {
                  this.field_B = true;
                  this.field_t = 8;
                  break L1;
                }
              }
            }
            this.a(27799, new taa(this.field_s, var8));
            this.a(0, var10, this.field_k, param5, this.field_r);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var7);
            stackOut_8_1 = new StringBuilder().append("qf.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void d(int param0) {
        field_A = null;
        field_w = null;
        field_x = null;
        field_y = null;
        if (param0 != 28766) {
            qf.e(-13);
        }
    }

    final static void e(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        kr var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            if (qg.field_b.field_z == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var1_int = 0;
                if (param0 == 20434) {
                  break L1;
                } else {
                  field_x = (be[]) null;
                  break L1;
                }
              }
              var2 = (kr) ((Object) qg.field_b.field_z.b((byte) 90));
              L2: while (true) {
                if (var2 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (null == qg.field_b.field_z) {
                      break L3;
                    } else {
                      var2.field_kb = var1_int % 4 * 39;
                      var2.field_rb = var1_int / 4 * 39;
                      break L3;
                    }
                  }
                  var2 = (kr) ((Object) qg.field_b.field_z.c(param0 ^ 20434));
                  var1_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "qf.N(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_w = "Your email address is used to identify this account";
        field_A = new String[]{"Walk", "Jump", "Sprint"};
        field_x = new be[10];
    }
}
