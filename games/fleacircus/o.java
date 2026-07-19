/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends wj {
    static int field_m;
    private long field_e;
    private long field_i;
    static String field_g;
    static boolean field_l;
    private long[] field_j;
    private int field_h;
    private long field_k;
    private int field_f;

    final long b(int param0) {
        if (param0 != -31887) {
            this.field_k = 83L;
            this.field_e = this.field_e + this.a((byte) -63);
            if (!((this.field_e ^ -1L) <= (this.field_k ^ -1L))) {
                return (-this.field_e + this.field_k) / 1000000L;
            }
            return 0L;
        }
        this.field_e = this.field_e + this.a((byte) -63);
        if (!((this.field_e ^ -1L) <= (this.field_k ^ -1L))) {
            return (-this.field_e + this.field_k) / 1000000L;
        }
        return 0L;
    }

    final static String a(byte param0, int param1, int param2) {
        boolean discarded$2 = false;
        if (param0 != 85) {
          discarded$2 = o.c((byte) -64);
          return param1 + "/" + param2;
        } else {
          return param1 + "/" + param2;
        }
    }

    private final long a(byte param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_6_0 = 0L;
        long stackIn_8_0 = 0L;
        long stackIn_12_0 = 0L;
        long stackIn_14_0 = 0L;
        long stackIn_21_0 = 0L;
        long stackIn_23_0 = 0L;
        long stackIn_27_0 = 0L;
        long stackIn_29_0 = 0L;
        long stackIn_36_0 = 0L;
        long stackIn_38_0 = 0L;
        long stackIn_42_0 = 0L;
        long stackIn_44_0 = 0L;
        long stackOut_26_0 = 0L;
        long stackOut_28_0 = 0L;
        long stackOut_20_0 = 0L;
        long stackOut_22_0 = 0L;
        long stackOut_11_0 = 0L;
        long stackOut_13_0 = 0L;
        long stackOut_5_0 = 0L;
        long stackOut_7_0 = 0L;
        long stackOut_41_0 = 0L;
        long stackOut_43_0 = 0L;
        long stackOut_35_0 = 0L;
        long stackOut_37_0 = 0L;
        L0: {
          var9 = fleas.field_A ? 1 : 0;
          var2 = System.nanoTime();
          var4 = -this.field_i + var2;
          this.field_i = var2;
          if (-5000000000L >= var4) {
            break L0;
          } else {
            if (5000000000L > var4) {
              this.field_j[this.field_h] = var4;
              this.field_h = (this.field_h + 1) % 10;
              if (-2 < (this.field_f ^ -1)) {
                this.field_f = this.field_f + 1;
                break L0;
              } else {
                var6 = 0L;
                if (param0 == -63) {
                  var8 = 1;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var8 > this.field_f) {
                          break L3;
                        } else {
                          stackOut_26_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                          stackIn_29_0 = stackOut_26_0;
                          stackIn_27_0 = stackOut_26_0;
                          if (var9 != 0) {
                            break L2;
                          } else {
                            var6 = stackIn_27_0;
                            var8++;
                            if (var9 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      stackOut_28_0 = var6 / (long)this.field_f;
                      stackIn_29_0 = stackOut_28_0;
                      break L2;
                    }
                    return stackIn_29_0;
                  }
                } else {
                  o.b((byte) -81);
                  var8 = 1;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var8 > this.field_f) {
                          break L6;
                        } else {
                          stackOut_20_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                          stackIn_23_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var9 != 0) {
                            break L5;
                          } else {
                            var6 = stackIn_21_0;
                            var8++;
                            if (var9 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      stackOut_22_0 = var6 / (long)this.field_f;
                      stackIn_23_0 = stackOut_22_0;
                      break L5;
                    }
                    return stackIn_23_0;
                  }
                }
              }
            } else {
              var6 = 0L;
              if (param0 == -63) {
                var8 = 1;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var8 > this.field_f) {
                        break L9;
                      } else {
                        stackOut_11_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var9 != 0) {
                          break L8;
                        } else {
                          var6 = stackIn_12_0;
                          var8++;
                          if (var9 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_13_0 = var6 / (long)this.field_f;
                    stackIn_14_0 = stackOut_13_0;
                    break L8;
                  }
                  return stackIn_14_0;
                }
              } else {
                o.b((byte) -81);
                var8 = 1;
                L10: while (true) {
                  L11: {
                    L12: {
                      if (var8 > this.field_f) {
                        break L12;
                      } else {
                        stackOut_5_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var9 != 0) {
                          break L11;
                        } else {
                          var6 = stackIn_6_0;
                          var8++;
                          if (var9 == 0) {
                            continue L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    stackOut_7_0 = var6 / (long)this.field_f;
                    stackIn_8_0 = stackOut_7_0;
                    break L11;
                  }
                  return stackIn_8_0;
                }
              }
            }
          }
        }
        var6 = 0L;
        if (param0 != -63) {
          o.b((byte) -81);
          var8 = 1;
          L13: while (true) {
            L14: {
              L15: {
                if (var8 > this.field_f) {
                  break L15;
                } else {
                  stackOut_41_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                  stackIn_44_0 = stackOut_41_0;
                  stackIn_42_0 = stackOut_41_0;
                  if (var9 != 0) {
                    break L14;
                  } else {
                    var6 = stackIn_42_0;
                    var8++;
                    if (var9 == 0) {
                      continue L13;
                    } else {
                      break L15;
                    }
                  }
                }
              }
              stackOut_43_0 = var6 / (long)this.field_f;
              stackIn_44_0 = stackOut_43_0;
              break L14;
            }
            return stackIn_44_0;
          }
        } else {
          var8 = 1;
          L16: while (true) {
            L17: {
              L18: {
                if (var8 > this.field_f) {
                  break L18;
                } else {
                  stackOut_35_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                  stackIn_38_0 = stackOut_35_0;
                  stackIn_36_0 = stackOut_35_0;
                  if (var9 != 0) {
                    break L17;
                  } else {
                    var6 = stackIn_36_0;
                    var8++;
                    if (var9 == 0) {
                      continue L16;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              stackOut_37_0 = var6 / (long)this.field_f;
              stackIn_38_0 = stackOut_37_0;
              break L17;
            }
            return stackIn_38_0;
          }
        }
    }

    public static void b(byte param0) {
        field_g = null;
        if (param0 < 55) {
            field_g = (String) null;
        }
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (param0 == -23124) {
            break L0;
          } else {
            break L0;
          }
        }
        if ((this.field_e ^ -1L) > (this.field_k ^ -1L)) {
          this.field_i = this.field_i + (this.field_k - this.field_e);
          this.field_e = this.field_e + (this.field_k + -this.field_e);
          this.field_k = this.field_k + param1;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            this.field_k = this.field_k + param1;
            var4++;
            stackOut_4_0 = -11;
            stackIn_5_0 = stackOut_4_0;
            L2: while (true) {
              L3: {
                if (stackIn_5_0 >= (var4 ^ -1)) {
                  break L3;
                } else {
                  if (this.field_e > this.field_k) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = (this.field_e < this.field_k ? -1 : (this.field_e == this.field_k ? 0 : 1));
              stackIn_5_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var5 != 0) {
                continue L2;
              } else {
                L4: {
                  if (stackIn_8_0 > 0) {
                    this.field_k = this.field_e;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return var4;
              }
            }
          }
        }
    }

    final static boolean c(byte param0) {
        if (param0 != 39) {
            field_m = 21;
            return jg.field_d;
        }
        return jg.field_d;
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
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
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < rf.field_d) {
                  break L1;
                } else {
                  if (param1.length() <= rh.field_a) {
                    L2: {
                      if (!param0) {
                        break L2;
                      } else {
                        field_m = -82;
                        break L2;
                      }
                    }
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("o.C(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final void c(int param0) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        String var3 = null;
        this.field_i = 0L;
        if (this.field_e >= this.field_k) {
          if (param0 != 12445) {
            var3 = (String) null;
            discarded$4 = o.a(true, (String) null);
            return;
          } else {
            return;
          }
        } else {
          this.field_e = this.field_e + (-this.field_e + this.field_k);
          if (param0 == 12445) {
            return;
          } else {
            var3 = (String) null;
            discarded$5 = o.a(true, (String) null);
            return;
          }
        }
    }

    o() {
        this.field_j = new long[10];
        this.field_i = 0L;
        this.field_e = 0L;
        this.field_h = 0;
        this.field_k = 0L;
        this.field_f = 1;
        this.field_e = System.nanoTime();
        this.field_k = System.nanoTime();
    }

    static {
        field_g = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_l = false;
    }
}
