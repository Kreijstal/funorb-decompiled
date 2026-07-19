/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static String[] field_e;
    static ji field_a;
    static int[] field_d;
    bh field_c;
    private bh field_b;

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -1) {
          L0: {
            field_d = (int[]) null;
            if (this.field_c.field_b != this.field_c) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_c.field_b != this.field_c) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void c(int param0) {
        int var3 = 0;
        bh var4 = null;
        bh var5 = null;
        bh var6 = null;
        var3 = client.field_A ? 1 : 0;
        if (param0 >= 104) {
          L0: while (true) {
            L1: {
              var5 = this.field_c.field_b;
              if (this.field_c != var5) {
                var5.b((byte) 120);
                break L1;
              } else {
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    this.field_b = null;
                    return;
                  } else {
                    var5.b((byte) 120);
                    break L1;
                  }
                }
              }
            }
            continue L0;
          }
        } else {
          var4 = (bh) null;
          this.a((bh) null, 114);
          L2: while (true) {
            L3: {
              var6 = this.field_c.field_b;
              if (this.field_c == var6) {
                if (var3 != 0) {
                  break L3;
                } else {
                  if (var3 == 0) {
                    this.field_b = null;
                    return;
                  } else {
                    var6.b((byte) 120);
                    break L3;
                  }
                }
              } else {
                var6.b((byte) 120);
                break L3;
              }
            }
            continue L2;
          }
        }
    }

    final bh d(int param0) {
        bh var2 = null;
        if (param0 < -23) {
          var2 = this.field_c.field_a;
          if (this.field_c == var2) {
            return null;
          } else {
            var2.b((byte) 115);
            return var2;
          }
        } else {
          return (bh) null;
        }
    }

    final void a(int param0, bh param1, vj param2) {
        bh var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4 = this.field_c.field_a;
              this.field_c.field_a = param1.field_a;
              param1.field_a.field_b = this.field_c;
              if (param0 <= -95) {
                break L1;
              } else {
                this.field_b = (bh) null;
                break L1;
              }
            }
            if (param1 == this.field_c) {
              break L0;
            } else {
              param1.field_a = param2.field_c.field_a;
              param1.field_a.field_b = param1;
              var4.field_b = param2.field_c;
              param2.field_c.field_a = var4;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4_ref);
            stackOut_5_1 = new StringBuilder().append("vj.M(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final bh a(int param0, bh param1) {
        boolean discarded$2 = false;
        bh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        bh stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 1) {
                break L1;
              } else {
                discarded$2 = this.b(-55);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 != null) {
                  break L3;
                } else {
                  var3 = this.field_c.field_b;
                  if (!client.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3 = param1;
              break L2;
            }
            if (this.field_c != var3) {
              this.field_b = var3.field_b;
              stackOut_8_0 = (bh) (var3);
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_b = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("vj.I(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bh) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(boolean param0) {
        ck[] discarded$1 = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        ck var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = client.field_A ? 1 : 0;
        try {
          L0: {
            cm.field_f.b(-30693);
            var1_int = 0;
            L1: while (true) {
              L2: {
                if (var1_int >= 32) {
                  var1_int = 0;
                  break L2;
                } else {
                  sf.field_y[var1_int] = 0L;
                  var1_int++;
                  if (var2 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  L5: {
                    if (-33 >= (var1_int ^ -1)) {
                      break L5;
                    } else {
                      jd.field_Ub[var1_int] = 0L;
                      var1_int++;
                      if (var2 != 0) {
                        break L4;
                      } else {
                        if (var2 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  vm.field_r = 0;
                  break L4;
                }
                if (param0) {
                  break L0;
                } else {
                  var3 = (ck) null;
                  discarded$1 = vj.a((ck) null, -91);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "vj.H(" + param0 + ')');
        }
    }

    final bh c(boolean param0) {
        bh var2 = null;
        if (!param0) {
            field_d = (int[]) null;
            var2 = this.field_b;
            if (!(var2 != this.field_c)) {
                this.field_b = null;
                return null;
            }
            this.field_b = var2.field_a;
            return var2;
        }
        var2 = this.field_b;
        if (!(var2 != this.field_c)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_a;
        return var2;
    }

    public static void b(byte param0) {
        if (param0 != 79) {
            return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static ck[] a(ck param0, int param1) {
        qm[] discarded$2 = null;
        ck[] var2 = null;
        RuntimeException var2_ref = null;
        ck[] var3 = null;
        ck[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 32169) {
                break L1;
              } else {
                discarded$2 = vj.e(-16);
                break L1;
              }
            }
            var3 = new ck[9];
            var2 = var3;
            var3[4] = param0;
            stackOut_2_0 = (ck[]) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("vj.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final bh c(byte param0) {
        int var2 = -55 / ((param0 - -17) / 35);
        bh var3 = this.field_c.field_b;
        if (!(var3 != this.field_c)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var3.field_b;
        return var3;
    }

    final void a(bh param0, int param1) {
        if (!(param0.field_a == null)) {
            param0.b((byte) 124);
        }
        param0.field_b = this.field_c;
        param0.field_a = this.field_c.field_a;
        if (param1 != 2777) {
            return;
        }
        try {
            param0.field_a.field_b = param0;
            param0.field_b.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "vj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final bh d(boolean param0) {
        if (!param0) {
            return (bh) null;
        }
        bh var2 = this.field_b;
        if (!(var2 != this.field_c)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_b;
        return var2;
    }

    final bh b(boolean param0) {
        bh var2 = null;
        if (param0) {
          var2 = this.field_c.field_a;
          if (this.field_c == var2) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_a;
            return var2;
          }
        } else {
          return (bh) null;
        }
    }

    final void b(bh param0, int param1) {
        bh discarded$2 = null;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0.field_a != null) {
                param0.b((byte) 115);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_b = this.field_c.field_b;
            param0.field_a = this.field_c;
            param0.field_a.field_b = param0;
            param0.field_b.field_a = param0;
            if (param1 == 7143) {
              break L0;
            } else {
              discarded$2 = this.d(false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("vj.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final bh a(int param0) {
        bh var2 = null;
        var2 = this.field_c.field_b;
        if (this.field_c != var2) {
          var2.b((byte) 108);
          if (param0 != 4) {
            return (bh) null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        bh var4 = null;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = 60 % ((param0 - 13) / 50);
        var4 = this.field_c.field_b;
        L0: while (true) {
          L1: {
            if (this.field_c == var4) {
              break L1;
            } else {
              var2++;
              var4 = var4.field_b;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          return var2;
        }
    }

    public vj() {
        this.field_c = new bh();
        this.field_c.field_a = this.field_c;
        this.field_c.field_b = this.field_c;
    }

    final static qm[] e(int param0) {
        if (param0 != -23521) {
          vj.a(false);
          return new qm[]{nh.field_i, ta.field_a, ie.field_d, gf.field_e, ul.field_e, oi.field_d, nk.field_f, vk.field_d, rg.field_g, wg.field_a, de.field_U, qm.field_g, rf.field_k, gh.field_c};
        } else {
          return new qm[]{nh.field_i, ta.field_a, ie.field_d, gf.field_e, ul.field_e, oi.field_d, nk.field_f, vk.field_d, rg.field_g, wg.field_a, de.field_U, qm.field_g, rf.field_k, gh.field_c};
        }
    }

    static {
        field_d = new int[8192];
    }
}
