/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static w field_c;
    static String field_i;
    private int field_p;
    boolean field_o;
    private int field_j;
    static int field_k;
    static ei[][] field_a;
    private boolean field_n;
    private int field_d;
    static int field_e;
    static ck field_g;
    static String field_m;
    int field_h;
    private int field_q;
    int field_l;
    static ji field_f;
    static String field_b;

    final void a(int param0, byte param1) {
        if (this.field_q == 0) {
            this.field_h = param0;
            this.field_o = true;
            this.field_n = false;
        }
        if (param1 >= -53) {
            field_b = (String) null;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            sk.e(-70);
        }
        return this.field_q != 0 ? true : false;
    }

    final boolean c(int param0) {
        if (param0 <= 111) {
            field_g = (ck) null;
        }
        return this.field_d == 102 ? true : false;
    }

    final void a(boolean param0, int param1, int param2) {
        this.field_q = 0;
        this.field_n = param0 ? true : false;
        if (!(!this.field_n)) {
            this.field_h = param2;
        }
        int var4 = -68 / ((54 - param1) / 44);
    }

    final boolean a(byte param0) {
        if (param0 != -51) {
            return false;
        }
        return this.field_d == 103 ? true : false;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return this.field_d == 96 ? true : false;
    }

    final void a(byte param0, int param1) {
        L0: {
          if (param0 == 58) {
            break L0;
          } else {
            this.field_h = 111;
            break L0;
          }
        }
        L1: {
          this.field_d = 0;
          this.field_p = 0;
          this.field_o = false;
          if (0 != this.field_q) {
            break L1;
          } else {
            this.field_d = wh.field_c;
            break L1;
          }
        }
        L2: {
          if (0 != this.field_q) {
            break L2;
          } else {
            if (wh.field_c != 96) {
              break L2;
            } else {
              L3: {
                if (this.field_h <= 0) {
                  this.field_h = this.field_l;
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_n = false;
              this.field_h = this.field_h - 1;
              this.field_o = true;
              break L2;
            }
          }
        }
        L4: {
          if (this.field_q != 0) {
            break L4;
          } else {
            if (wh.field_c != 97) {
              break L4;
            } else {
              this.field_h = this.field_h + 1;
              this.field_n = false;
              this.field_o = true;
              if (this.field_l > this.field_h) {
                break L4;
              } else {
                this.field_h = 0;
                break L4;
              }
            }
          }
        }
        L5: {
          if (this.field_q != 0) {
            break L5;
          } else {
            L6: {
              if (98 == wh.field_c) {
                break L6;
              } else {
                if (wh.field_c == 99) {
                  break L6;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (this.field_h < 0) {
                this.field_h = param1;
                break L7;
              } else {
                break L7;
              }
            }
            this.field_n = false;
            this.field_o = true;
            break L5;
          }
        }
    }

    final boolean b(int param0) {
        int var2 = 90 % ((31 - param0) / 42);
        return this.field_d == 97 ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_n = param3 ? true : false;
        this.field_q = param1;
        if (this.field_n) {
            this.field_h = param2;
        } else {
            this.field_h = param0;
        }
    }

    final void a(int param0) {
        this.field_o = false;
        this.field_p = 0;
        if (param0 > -24) {
            return;
        }
        this.field_d = 0;
        if (0 == this.field_q) {
            if (wh.field_c == 98) {
                if (!(this.field_h > 0)) {
                    this.field_h = this.field_l;
                }
                this.field_h = this.field_h - 1;
                this.field_n = false;
                this.field_o = true;
            }
        }
        if (!(this.field_q != 0)) {
            this.field_d = wh.field_c;
        }
        if (0 == this.field_q) {
            if (!(wh.field_c != 99)) {
                this.field_h = this.field_h + 1;
                this.field_n = false;
                if (this.field_h >= this.field_l) {
                    this.field_h = 0;
                }
                this.field_o = true;
            }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_33_0 = var5;
                stackIn_34_0 = stackOut_33_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (0 == var8) {
                      if (var9 == 45) {
                        var4_int = 1;
                        break L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (57 < var9) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0 != 0;
                  }
                  if (var9 < 10) {
                    L8: {
                      if (var4_int == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = var9 + var6 * 10;
                    if (var10 / 10 == var6) {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    } else {
                      stackOut_27_0 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      return stackIn_28_0 != 0;
                    }
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var4);
            stackOut_35_1 = new StringBuilder().append("sk.O(").append(true).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + true + ',' + 10 + ')');
        }
        return stackIn_34_0 != 0;
    }

    final static int a(int param0, int param1) {
        if (param1 >= -52) {
            field_k = -122;
        }
        param0 = param0 & 8191;
        if (param0 < 4096) {
            return param0 < 2048 ? pd.field_i[param0] : pd.field_i[4096 - param0];
        }
        return param0 >= 6144 ? -pd.field_i[-param0 + 8192] : -pd.field_i[-4096 + param0];
    }

    final void d(int param0) {
        this.field_d = 0;
        this.field_p = param0;
        this.field_o = false;
        if (this.field_q == 0) {
            this.field_d = wh.field_c;
        }
    }

    public static void e(int param0) {
        field_c = null;
        field_i = null;
        field_m = null;
        field_f = null;
        field_g = null;
        if (param0 != -28610) {
            sk.e(69);
        }
        field_a = (ei[][]) null;
        field_b = null;
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_l <= param0) {
          throw new IllegalArgumentException();
        } else {
          if (~param2 <= ~this.field_l) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              this.field_d = 0;
              this.field_p = 0;
              this.field_o = false;
              if (ig.field_Yb == 0) {
                break L0;
              } else {
                this.field_n = true;
                this.field_q = ig.field_Yb;
                this.field_p = ig.field_Yb;
                this.field_h = param2;
                this.field_j = ib.field_kb;
                break L0;
              }
            }
            L1: {
              if (this.field_q == 0) {
                break L1;
              } else {
                if (be.field_n == 0) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_j > 0) {
                      break L2;
                    } else {
                      this.field_j = qd.field_Ob;
                      break L2;
                    }
                  }
                  this.field_j = this.field_j - 1;
                  break L1;
                }
              }
            }
            if (param1 == -20563) {
              L3: {
                if (ig.field_Yb != 0) {
                  break L3;
                } else {
                  if (be.field_n == 0) {
                    this.field_q = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (this.field_q != 0) {
                  break L4;
                } else {
                  L5: {
                    if (this.field_n) {
                      break L5;
                    } else {
                      if (pm.field_b) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param0 >= 0) {
                    L6: {
                      if (~this.field_h == ~param0) {
                        break L6;
                      } else {
                        this.field_o = true;
                        break L6;
                      }
                    }
                    this.field_n = true;
                    this.field_h = param0;
                    break L4;
                  } else {
                    if (!this.field_n) {
                      break L4;
                    } else {
                      this.field_h = -1;
                      break L4;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean b(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 114) {
          L0: {
            L1: {
              if (0 != this.field_p) {
                break L1;
              } else {
                if (84 == this.field_d) {
                  break L1;
                } else {
                  if (this.field_d != 83) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public sk() {
        this.field_n = false;
        this.field_h = 0;
    }

    sk(int param0) {
        this.field_n = false;
        this.field_h = 0;
        this.field_l = param0;
    }

    static {
        field_i = "START!";
        field_a = new ei[2][8];
        field_m = "Private";
        field_b = "Draw?";
    }
}
