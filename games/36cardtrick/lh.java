/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    boolean field_h;
    static li field_d;
    private int field_g;
    private int field_b;
    private int field_e;
    int field_i;
    private int field_j;
    static de field_a;
    int field_k;
    private int field_f;
    static String field_c;

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.field_h = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 != (this.field_f ^ -1)) {
              break L2;
            } else {
              if (this.field_e == 84) {
                break L2;
              } else {
                if (this.field_e != 83) {
                  stackIn_8_0 = 0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackIn_8_0 = 1;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final void g(int param0) {
        this.field_b = 0;
        this.field_e = 0;
        if (param0 <= 92) {
            return;
        }
        this.field_f = 0;
        if (this.field_j == 0) {
            this.field_e = tb.field_d;
        }
    }

    final boolean a(byte param0) {
        if (param0 >= -34) {
            this.d(110);
        }
        return 0 != this.field_j ? true : false;
    }

    final void a(int param0, byte param1, int param2) {
        int var4;
        if (param0 < this.field_i) {
          var4 = -73 / ((83 - param1) / 32);
          if (this.field_i <= param2) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              this.field_b = 0;
              this.field_f = 0;
              this.field_e = 0;
              if (dl.field_h != 0) {
                this.field_g = t.field_k;
                this.field_j = dl.field_h;
                this.field_h = true;
                this.field_k = param2;
                this.field_f = dl.field_h;
                this.field_b = dl.field_h;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (0 == this.field_j) {
                if (dl.field_h != 0) {
                  break L1;
                } else {
                  if (0 != k.field_c) {
                    break L1;
                  } else {
                    this.field_j = 0;
                    break L1;
                  }
                }
              } else {
                if (dl.field_h != 0) {
                  break L1;
                } else {
                  if (0 != k.field_c) {
                    break L1;
                  } else {
                    this.field_j = 0;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (0 != this.field_j) {
                break L2;
              } else {
                L3: {
                  if (this.field_h) {
                    break L3;
                  } else {
                    if (d.field_s) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (0 > param0) {
                  if (this.field_h) {
                    this.field_k = -1;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  L4: {
                    if (this.field_k != param0) {
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_k = param0;
                  this.field_h = true;
                  break L2;
                }
              }
            }
            return;
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void c(byte param0) {
        this.field_b = 0;
        this.field_f = 0;
        this.field_e = 0;
        if (this.field_j == 0) {
            this.field_e = tb.field_d;
        }
        if (this.field_j == 0 && -97 == (tb.field_d ^ -1)) {
            if (!(this.field_k > 0)) {
                this.field_k = this.field_i;
            }
            this.field_k = this.field_k - 1;
            this.field_h = false;
        }
        if (-1 == (this.field_j ^ -1)) {
            if (!(97 != tb.field_d)) {
                this.field_k = this.field_k + 1;
                if (!(this.field_i > this.field_k)) {
                    this.field_k = 0;
                }
                this.field_h = false;
            }
        }
        if (param0 <= 10) {
            this.field_b = 25;
        }
    }

    final boolean b(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == 2) {
          L0: {
            L1: {
              if ((this.field_f ^ -1) == -3) {
                break L1;
              } else {
                if ((this.field_e ^ -1) != -97) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final void a(int param0, int param1) {
        if (!(0 != this.field_j)) {
            this.field_h = false;
            this.field_k = param1;
        }
        if (param0 != 31973) {
            this.field_e = 70;
        }
    }

    final void b(byte param0) {
        this.field_e = 0;
        this.field_b = 0;
        this.field_f = 0;
        if (param0 != 76) {
            return;
        }
        if (this.field_j == 0) {
            this.field_e = tb.field_d;
        }
        if (0 == this.field_j) {
            if (!(tb.field_d != 98)) {
                if ((this.field_k ^ -1) >= -1) {
                    this.field_k = this.field_i;
                }
                this.field_k = this.field_k - 1;
                this.field_h = false;
            }
        }
        if (this.field_j == 0) {
            if (!((tb.field_d ^ -1) != -100)) {
                this.field_k = this.field_k + 1;
                this.field_h = false;
                if (this.field_i <= this.field_k) {
                    this.field_k = 0;
                }
            }
        }
    }

    final static void a(int param0, vk param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Main.field_T;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -4) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= jh.field_c) {
                    dupTemp$0 = param1.b(2);
                    ab.field_u[dupTemp$0] = ab.field_u[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= jh.field_c) {
                        L4: {
                          jh.field_c = var2_int;
                          fieldTemp$1 = jh.field_c;
                          jh.field_c = jh.field_c + 1;
                          me.field_b[fieldTemp$1] = param1;
                          if (param0 == 7743) {
                            break L4;
                          } else {
                            field_a = (de) null;
                            break L4;
                          }
                        }
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (me.field_b[var3].field_k != param1.field_k) {
                              break L6;
                            } else {
                              var4 = me.field_b[var3].b(2);
                              if (mj.field_e >= ab.field_u[var4]) {
                                break L6;
                              } else {
                                ab.field_u[var4] = ab.field_u[var4] - 1;
                                break L5;
                              }
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          me.field_b[incrementValue$2] = me.field_b[var3];
                          break L5;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (param1.field_k == me.field_b[var2_int].field_k) {
                        dupTemp$3 = me.field_b[var2_int].b(2);
                        ab.field_u[dupTemp$3] = ab.field_u[dupTemp$3] + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                ab.field_u[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("lh.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    final boolean d(int param0) {
        if (param0 != -12819) {
            this.d((byte) -69);
        }
        return this.field_e == 103 ? true : false;
    }

    final boolean d(byte param0) {
        if (param0 != 68) {
            this.field_k = 95;
        }
        return this.field_e == 102 ? true : false;
    }

    final boolean f(int param0) {
        int stackIn_8_0 = 0;
        L0: {
          if (param0 == -85) {
            break L0;
          } else {
            field_a = (de) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_b != 0) {
              break L2;
            } else {
              if (-85 == (this.field_e ^ -1)) {
                break L2;
              } else {
                if (83 != this.field_e) {
                  stackIn_8_0 = 0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackIn_8_0 = 1;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    lh(int param0) {
        this.field_h = false;
        this.field_k = 0;
        this.field_i = param0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 7865) {
            lh.a(-76);
        }
        field_c = null;
        field_d = null;
    }

    final boolean e(int param0) {
        int stackIn_9_0 = 0;
        if (param0 == 14354) {
          L0: {
            L1: {
              if (this.field_f == 1) {
                break L1;
              } else {
                if (97 == this.field_e) {
                  break L1;
                } else {
                  if (-85 == (this.field_e ^ -1)) {
                    break L1;
                  } else {
                    if (-84 != (this.field_e ^ -1)) {
                      stackIn_9_0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = 1;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    final static wb a(String param0, qk param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param1.a(18659, param2);
            var5 = 1 % ((param3 - 43) / 62);
            var6 = param1.a(var4_int, param0, (byte) 7);
            stackIn_1_0 = oj.a(var4_int, param1, var6, -8691);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("lh.O(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_j = 0;
        int var5 = 124 / ((param0 - 42) / 55);
        this.field_h = param3 ? true : false;
        if (this.field_h) {
            this.field_k = param1;
        } else {
            this.field_k = param2;
        }
    }

    static {
        field_a = new de(11, 0, 1, 2);
    }
}
