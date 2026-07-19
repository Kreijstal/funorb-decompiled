/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    private wb field_h;
    private wb field_i;
    static int field_e;
    static int[] field_j;
    static il field_c;
    private long field_d;
    private int field_b;
    static km field_g;
    private wb[] field_f;
    private int field_a;

    final wb b(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        wb var2 = null;
        int var3 = 0;
        wb var4 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param0 == -1) {
          L0: {
            if (0 >= this.field_b) {
              break L0;
            } else {
              if (this.field_h == this.field_f[this.field_b + -1]) {
                break L0;
              } else {
                var2 = this.field_h;
                this.field_h = var2.field_h;
                return var2;
              }
            }
          }
          L1: while (true) {
            if (this.field_b < this.field_a) {
              fieldTemp$3 = this.field_b;
              this.field_b = this.field_b + 1;
              var4 = this.field_f[fieldTemp$3].field_h;
              var2 = var4;
              if (var4 != this.field_f[this.field_b + -1]) {
                this.field_h = var2.field_h;
                return var2;
              } else {
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          kf.a(-101, -32);
          if (0 < this.field_b) {
            if (this.field_h == this.field_f[this.field_b + -1]) {
              L2: while (true) {
                if (this.field_b < this.field_a) {
                  fieldTemp$4 = this.field_b;
                  this.field_b = this.field_b + 1;
                  var4 = this.field_f[fieldTemp$4].field_h;
                  var2 = var4;
                  if (var4 != this.field_f[this.field_b + -1]) {
                    this.field_h = var2.field_h;
                    return var2;
                  } else {
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var2 = this.field_h;
              this.field_h = var2.field_h;
              return var2;
            }
          } else {
            L3: while (true) {
              if (this.field_b < this.field_a) {
                fieldTemp$5 = this.field_b;
                this.field_b = this.field_b + 1;
                var4 = this.field_f[fieldTemp$5].field_h;
                var2 = var4;
                if (var4 != this.field_f[this.field_b + -1]) {
                  this.field_h = var2.field_h;
                  return var2;
                } else {
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -1) {
            return;
        }
        el.field_r = param0;
    }

    final wb a(boolean param0) {
        this.field_b = 0;
        if (!param0) {
            return (wb) null;
        }
        return this.b(-1);
    }

    public static void a(int param0) {
        if (param0 != -1) {
          kf.a(12);
          field_j = null;
          field_c = null;
          field_g = null;
          return;
        } else {
          field_j = null;
          field_c = null;
          field_g = null;
          return;
        }
    }

    final static void a(int param0, int param1, long param2, int param3, String param4, boolean param5) {
        int var7_int = 0;
        gk.field_g.g(param0, 8);
        gk.field_g.field_l = gk.field_g.field_l + 1;
        if (param3 < 4) {
            return;
        }
        try {
            var7_int = gk.field_g.field_l;
            gk.field_g.a((byte) -66, param2);
            gk.field_g.a(param4, (byte) -119);
            gk.field_g.a(param1, 55);
            gk.field_g.a(!param5 ? 0 : 1, 125);
            gk.field_g.b(-var7_int + gk.field_g.field_l, -1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "kf.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wg param4, wg param5) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ng.field_P = param1;
              hd.field_e = param3;
              ma.field_h = param5;
              tg.field_D = param4;
              dj.field_e = param2;
              if (param0 == 0) {
                break L1;
              } else {
                discarded$2 = kf.a((byte) -53);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("kf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 == 0) {
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_e = -105;
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final wb c(int param0) {
        wb var2 = null;
        wb var3 = null;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        if (this.field_i != null) {
          var2 = this.field_f[(int)(this.field_d & (long)(-1 + this.field_a))];
          L0: while (true) {
            if (var2 == this.field_i) {
              if (param0 != 48) {
                return (wb) null;
              } else {
                this.field_i = null;
                return null;
              }
            } else {
              if ((this.field_d ^ -1L) == (this.field_i.field_j ^ -1L)) {
                var3 = this.field_i;
                this.field_i = this.field_i.field_h;
                return var3;
              } else {
                this.field_i = this.field_i.field_h;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final wb a(long param0, byte param1) {
        wb var4 = null;
        int var5_int = 0;
        wb var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        this.field_d = param0;
        var4 = this.field_f[(int)((long)(this.field_a + -1) & param0)];
        this.field_i = var4.field_h;
        L0: while (true) {
          if (this.field_i != var4) {
            if (this.field_i.field_j != param0) {
              this.field_i = this.field_i.field_h;
              continue L0;
            } else {
              var5 = this.field_i;
              this.field_i = this.field_i.field_h;
              return var5;
            }
          } else {
            var5_int = 59 / ((43 - param1) / 33);
            this.field_i = null;
            return null;
          }
        }
    }

    final void a(long param0, wb param1, int param2) {
        if (!(null == param1.field_k)) {
            param1.c(92);
        }
        wb var5 = this.field_f[(int)((long)(this.field_a + -1) & param0)];
        param1.field_h = var5;
        param1.field_k = var5.field_k;
        param1.field_k.field_h = param1;
        param1.field_h.field_k = param1;
        if (param2 != 30804) {
            return;
        }
        try {
            param1.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "kf.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        boolean discarded$2 = false;
        bf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        bf var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (bf) ((Object) l.field_c.a((byte) -66));
            var1 = var4;
            if (var1 != null) {
              L1: {
                if (param0 == -74) {
                  break L1;
                } else {
                  discarded$2 = kf.a((byte) -15);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var1.field_n <= var2) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L3: {
                    if (var4.field_q[var2] == null) {
                      break L3;
                    } else {
                      if (var4.field_q[var2].field_a != 0) {
                        break L3;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L4: {
                    if (var4.field_r[var2] != null) {
                      if (0 != var4.field_r[var2].field_a) {
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "kf.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    kf(int param0) {
        wb dupTemp$2 = null;
        int var2 = 0;
        wb var3 = null;
        this.field_b = 0;
        this.field_f = new wb[param0];
        this.field_a = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$2 = new wb();
            var3 = dupTemp$2;
            this.field_f[var2] = dupTemp$2;
            var3.field_h = var3;
            var3.field_k = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
    }
}
