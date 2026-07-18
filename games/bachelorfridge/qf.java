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
        try {
            var6 = ((qf) this).field_s.b(param1, -23990);
            var6.field_s.field_s = param2;
            super.a(param2, param4, 27230);
            ((qf) this).field_n = -50;
            this.a(param1, param3, -3670);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "qf.I(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(aga param0, boolean param1, int param2) {
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
              var4_int = 10;
              if (param0.field_y == 17) {
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
              ((qf) this).field_q = wka.a(57, ((qf) this).field_C, var4_int, ((qf) this).field_r);
              ((qf) this).field_z = ((qf) this).field_q;
              if (!param1) {
                break L3;
              } else {
                ((qf) this).field_q = ((qf) this).field_q + wka.a(57, ((qf) this).field_C, var4_int, 1);
                break L3;
              }
            }
            if (((qf) this).field_z == 0) {
              ((qf) this).field_z = 10;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("qf.L(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + -3670 + ')');
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
        var7 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
        var3 = -27 % ((71 - param0) / 47);
        int fieldTemp$1 = ((qf) this).field_n + 1;
        ((qf) this).field_n = ((qf) this).field_n + 1;
        if (fieldTemp$1 < 0) {
          return false;
        } else {
          L0: {
            if (null != ((qf) this).field_u) {
              break L0;
            } else {
              if (var7.field_s.field_y != 32) {
                break L0;
              } else {
                var4_ref_je = je.a(rt.field_a[32], 256, 256);
                var4_ref_je.d(-1);
                ((qf) this).field_u = tw.a(var4_ref_je, (byte) -36);
                break L0;
              }
            }
          }
          if (0 == ((qf) this).field_n) {
            if (!((qf) this).field_B) {
              L1: {
                if (32 == var7.field_s.field_y) {
                  break L1;
                } else {
                  var7.b(-1, ((qf) this).field_t);
                  break L1;
                }
              }
              ((qf) this).field_s.field_s.a(var7, 107);
              if (((qf) this).field_q >= ((qf) this).field_n) {
                if (((qf) this).field_z >= ((qf) this).field_n) {
                  var4 = ((qf) this).field_n + -((qf) this).field_m;
                  var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                  var2.field_o = (((qf) this).field_l << 16) * var4 / ((qf) this).field_z;
                  var2.field_r = var4 * (((qf) this).field_j << 16) / ((qf) this).field_z;
                  return false;
                } else {
                  L2: {
                    var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                    var4 = ((qf) this).field_q - ((qf) this).field_z >> 1;
                    var5 = -((qf) this).field_n + -var4 + ((qf) this).field_q;
                    if (0 <= var5) {
                      break L2;
                    } else {
                      var5 = -var5;
                      break L2;
                    }
                  }
                  var5 = ((qf) this).field_q + (-var4 - var5);
                  var2.field_r = (((qf) this).field_j << 16) * var5 / ((qf) this).field_z;
                  var2.field_o = (((qf) this).field_l << 16) * var5 / ((qf) this).field_z;
                  return false;
                }
              } else {
                this.c(true);
                return true;
              }
            } else {
              ((qf) this).field_s.field_s.a(var7, 107);
              if (((qf) this).field_q >= ((qf) this).field_n) {
                if (((qf) this).field_z >= ((qf) this).field_n) {
                  var4 = ((qf) this).field_n + -((qf) this).field_m;
                  var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                  var2.field_o = (((qf) this).field_l << 16) * var4 / ((qf) this).field_z;
                  var2.field_r = var4 * (((qf) this).field_j << 16) / ((qf) this).field_z;
                  return false;
                } else {
                  L3: {
                    var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                    var4 = ((qf) this).field_q - ((qf) this).field_z >> 1;
                    var5 = -((qf) this).field_n + -var4 + ((qf) this).field_q;
                    if (0 <= var5) {
                      break L3;
                    } else {
                      var5 = -var5;
                      break L3;
                    }
                  }
                  var5 = ((qf) this).field_q + (-var4 - var5);
                  var2.field_r = (((qf) this).field_j << 16) * var5 / ((qf) this).field_z;
                  var2.field_o = (((qf) this).field_l << 16) * var5 / ((qf) this).field_z;
                  return false;
                }
              } else {
                this.c(true);
                return true;
              }
            }
          } else {
            ((qf) this).field_s.field_s.a(var7, 107);
            if (((qf) this).field_q >= ((qf) this).field_n) {
              if (((qf) this).field_z >= ((qf) this).field_n) {
                var4 = ((qf) this).field_n + -((qf) this).field_m;
                var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                var2.field_o = (((qf) this).field_l << 16) * var4 / ((qf) this).field_z;
                var2.field_r = var4 * (((qf) this).field_j << 16) / ((qf) this).field_z;
                return false;
              } else {
                L4: {
                  var2 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
                  var4 = ((qf) this).field_q - ((qf) this).field_z >> 1;
                  var5 = -((qf) this).field_n + -var4 + ((qf) this).field_q;
                  if (0 <= var5) {
                    break L4;
                  } else {
                    var5 = -var5;
                    break L4;
                  }
                }
                var5 = ((qf) this).field_q + (-var4 - var5);
                var2.field_r = (((qf) this).field_j << 16) * var5 / ((qf) this).field_z;
                var2.field_o = (((qf) this).field_l << 16) * var5 / ((qf) this).field_z;
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
          var3 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
          var2 = var3;
          var3.b(false);
          var3.field_r = 0;
          var3.field_o = 0;
          var3.field_k = 0;
          if (null != ((qf) this).field_u) {
            id.a(72, ((qf) this).field_u);
            break L0;
          } else {
            break L0;
          }
        }
        if (123 == ((qf) this).field_C) {
          ((qf) this).field_s.b(var3, (ad) null, true);
          var3.field_s.field_s = ((qf) this).field_k;
          if (hl.a((byte) -124, ((qf) this).field_C)) {
            if (!var3.field_s.g((byte) 85)) {
              if (var3.field_s.field_y != 33) {
                if (var3.field_s.field_y == 31) {
                  return;
                } else {
                  ((qf) this).field_s.a(-16007, var3, 2);
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
          ((qf) this).field_s.a(-119, ((qf) this).field_r, var3, ((qf) this).field_k);
          var3.field_s.field_s = ((qf) this).field_k;
          if (hl.a((byte) -124, ((qf) this).field_C)) {
            if (!var3.field_s.g((byte) 85)) {
              if (var3.field_s.field_y != 33) {
                if (var3.field_s.field_y == 31) {
                  return;
                } else {
                  ((qf) this).field_s.a(-16007, var3, 2);
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
    }

    qf(gj param0, df param1) {
        this(param0, param1.field_l, param1.field_k, param1.field_p, param1.field_n, param1.field_t);
        ad var3 = null;
        try {
            var3 = ((qf) this).field_p.a(-27449, ((qf) this).field_s);
            var3.field_s.d(param1.field_k, (byte) -115);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
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
              var10 = ((qf) this).field_p.a(114, ((qf) this).field_s.field_h);
              var8 = ((qf) this).field_s.b(var10, -23990);
              ((qf) this).field_C = param2;
              if (((qf) this).field_C == 0) {
                ((qf) this).field_t = 1;
                break L1;
              } else {
                if (hl.a((byte) -49, ((qf) this).field_C)) {
                  ((qf) this).field_t = 3;
                  break L1;
                } else {
                  ((qf) this).field_B = true;
                  ((qf) this).field_t = 8;
                  break L1;
                }
              }
            }
            ((qf) this).a(27799, (at) (Object) new taa(((qf) this).field_s, var8));
            this.a(0, var10, ((qf) this).field_k, param5, ((qf) this).field_r);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("qf.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void d(int param0) {
        field_A = null;
        field_w = null;
        field_x = null;
        field_y = null;
    }

    final static void e(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        kr var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            if (qg.field_b.field_z == null) {
              return;
            } else {
              var1_int = 0;
              var2 = (kr) (Object) qg.field_b.field_z.b((byte) 90);
              L1: while (true) {
                if (var2 == null) {
                  break L0;
                } else {
                  L2: {
                    if (null == qg.field_b.field_z) {
                      break L2;
                    } else {
                      var2.field_kb = var1_int % 4 * 39;
                      var2.field_rb = var1_int / 4 * 39;
                      break L2;
                    }
                  }
                  var2 = (kr) (Object) qg.field_b.field_z.c(0);
                  var1_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "qf.N(" + 20434 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Your email address is used to identify this account";
        field_A = new String[]{"Walk", "Jump", "Sprint"};
        field_x = new be[10];
    }
}
