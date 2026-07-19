/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class koa {
    static ka[] field_b;
    static String field_d;
    private int field_e;
    private lj[] field_f;
    private dha[] field_a;
    static String field_c;

    final static int b(int param0) {
        if (param0 != 0) {
            field_d = (String) null;
            return qf.field_i;
        }
        return qf.field_i;
    }

    private final void a(byte param0) {
        int incrementValue$1 = 0;
        int var2 = 0;
        int var3_int = 0;
        lj[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 == -12) {
          var3_int = 0;
          L0: while (true) {
            if (this.field_f.length <= var3_int) {
              if (var2 > 0) {
                var3 = new lj[this.field_f.length + -var2];
                if (var3.length > 0) {
                  var4 = 0;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 < this.field_f.length) {
                      if (var6 == 0) {
                        L2: {
                          if (null == this.field_f[var5]) {
                            break L2;
                          } else {
                            if (!this.field_f[var5].n(31974).b(59)) {
                              incrementValue$1 = var4;
                              var4++;
                              var3[incrementValue$1] = this.field_f[var5];
                              break L2;
                            } else {
                              var5++;
                              continue L1;
                            }
                          }
                        }
                        var5++;
                        continue L1;
                      } else {
                        return;
                      }
                    } else {
                      this.field_f = var3;
                      return;
                    }
                  }
                } else {
                  this.field_f = var3;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (var6 == 0) {
                L3: {
                  L4: {
                    if (null == this.field_f[var3_int]) {
                      break L4;
                    } else {
                      if (!this.field_f[var3_int].n(param0 + 31986).b(59)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2++;
                  break L3;
                }
                var3_int++;
                continue L0;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, lj[] param1) {
        try {
            if (param0 != 9) {
                this.field_f = (lj[]) null;
            }
            this.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "koa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ew param1, kh param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.a((byte) -12);
            param2.a((byte) 43, this.field_f.length, iia.d(this.field_e, 22972));
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (this.field_f.length <= var4_int) {
                      break L4;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_11_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (((koa) (this)).field_f[var4_int].h((byte) 114) == param1) {
                              break L6;
                            } else {
                              param2.a((byte) -126, 0, 1);
                              param2.a((byte) -127, this.field_f[var4_int].n(31974).field_d, 8);
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          param2.a((byte) 70, 1, 1);
                          param2.a((byte) 61, this.field_f[var4_int].i((byte) 84).field_d, 8);
                          break L5;
                        }
                        var4_int++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 == 30489) {
                    break L2;
                  } else {
                    stackOut_10_0 = this;
                    stackIn_11_0 = stackOut_10_0;
                    break L3;
                  }
                }
                ((koa) (this)).field_a = (dha[]) null;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("koa.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L7;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L7;
            }
          }
          L8: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final void a(ew param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        dha var4 = null;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_a == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_f = new lj[this.field_a.length];
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (this.field_a.length <= var3_int) {
                      break L3;
                    } else {
                      var4 = this.field_a[var3_int];
                      this.field_f[var3_int] = param0.a(28672, var4.field_a, var4.field_b);
                      var3_int++;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  this.field_a = null;
                  break L2;
                }
                L4: {
                  if (param1 != 8) {
                    field_b = (ka[]) null;
                    this.a((byte) -12);
                    break L4;
                  } else {
                    this.a((byte) -12);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("koa.E(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final lj[] c(int param0) {
        if (param0 != 1) {
            field_c = (String) null;
            return this.field_f;
        }
        return this.field_f;
    }

    koa(int param0, int param1) {
        this.field_e = param0;
        this.field_f = new lj[]{};
    }

    koa(int param0, int param1, int param2, kh param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        dha[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        dha stackIn_7_2 = null;
        dha stackIn_7_3 = null;
        dha[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        dha stackIn_8_2 = null;
        dha stackIn_8_3 = null;
        dha[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        dha stackIn_9_2 = null;
        dha stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        dha[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        dha stackOut_6_2 = null;
        dha stackOut_6_3 = null;
        dha[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        dha stackOut_8_2 = null;
        dha stackOut_8_3 = null;
        int stackOut_8_4 = 0;
        dha[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        dha stackOut_7_2 = null;
        dha stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_e = param0;
            var5_int = param3.b((byte) 44, iia.d(param0, 22972));
            this.field_f = new lj[var5_int];
            this.field_a = new dha[var5_int];
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5_int) {
                break L0;
              } else {
                if (var7 == 0) {
                  L2: {
                    L3: {
                      if (param2 <= 9) {
                        break L3;
                      } else {
                        L4: {
                          stackOut_6_0 = this.field_a;
                          stackOut_6_1 = var6;
                          stackOut_6_2 = null;
                          stackOut_6_3 = null;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_8_2 = stackOut_6_2;
                          stackIn_8_3 = stackOut_6_3;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          stackIn_7_2 = stackOut_6_2;
                          stackIn_7_3 = stackOut_6_3;
                          if ((param3.b((byte) 44, 1) ^ -1) != -2) {
                            stackOut_8_0 = (dha[]) ((Object) stackIn_8_0);
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = null;
                            stackOut_8_3 = null;
                            stackOut_8_4 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            stackIn_9_3 = stackOut_8_3;
                            stackIn_9_4 = stackOut_8_4;
                            break L4;
                          } else {
                            stackOut_7_0 = (dha[]) ((Object) stackIn_7_0);
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = null;
                            stackOut_7_3 = null;
                            stackOut_7_4 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            stackIn_9_3 = stackOut_7_3;
                            stackIn_9_4 = stackOut_7_4;
                            break L4;
                          }
                        }
                        stackIn_9_0[stackIn_9_1] = new dha(stackIn_9_4 != 0, param3.b((byte) 44, 8));
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_a[var6] = new dha(false, param3.b((byte) 44, 8));
                    break L2;
                  }
                  var6++;
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("koa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 > -71) {
            discarded$0 = koa.b(50);
        }
    }

    static {
        field_d = "These trigger-happy dart totems are ready to shoot their mouths off. And yours. Best dart past them quickly.";
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
