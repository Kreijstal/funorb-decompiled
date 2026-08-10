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
        if (-1 == (this.field_q ^ -1)) {
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
        return (this.field_q ^ -1) != -1 ? true : false;
    }

    final boolean c(int param0) {
        if (param0 <= 111) {
            field_g = (ck) null;
        }
        return (this.field_d ^ -1) == -103 ? true : false;
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
        return (this.field_d ^ -1) == -104 ? true : false;
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
          if (0 == this.field_q) {
            if ((wh.field_c ^ -1) == -97) {
              L3: {
                if ((this.field_h ^ -1) >= -1) {
                  this.field_h = this.field_l;
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_n = false;
              this.field_h = this.field_h - 1;
              this.field_o = true;
              if (-1 != (this.field_q ^ -1)) {
                break L2;
              } else {
                if (wh.field_c != 97) {
                  break L2;
                } else {
                  this.field_h = this.field_h + 1;
                  this.field_n = false;
                  this.field_o = true;
                  if (this.field_l > this.field_h) {
                    break L2;
                  } else {
                    this.field_h = 0;
                    break L2;
                  }
                }
              }
            } else {
              if (-1 != (this.field_q ^ -1)) {
                break L2;
              } else {
                if (wh.field_c != 97) {
                  break L2;
                } else {
                  this.field_h = this.field_h + 1;
                  this.field_n = false;
                  this.field_o = true;
                  if (this.field_l > this.field_h) {
                    break L2;
                  } else {
                    this.field_h = 0;
                    break L2;
                  }
                }
              }
            }
          } else {
            if (-1 != (this.field_q ^ -1)) {
              break L2;
            } else {
              if (wh.field_c != 97) {
                break L2;
              } else {
                this.field_h = this.field_h + 1;
                this.field_n = false;
                this.field_o = true;
                if (this.field_l > this.field_h) {
                  break L2;
                } else {
                  this.field_h = 0;
                  break L2;
                }
              }
            }
          }
        }
        L4: {
          if (this.field_q != 0) {
            break L4;
          } else {
            L5: {
              if (98 == wh.field_c) {
                break L5;
              } else {
                if ((wh.field_c ^ -1) == -100) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              if (-1 < (this.field_h ^ -1)) {
                this.field_h = param1;
                break L6;
              } else {
                break L6;
              }
            }
            this.field_n = false;
            this.field_o = true;
            break L4;
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
        if (0 == this.field_q && wh.field_c == 98) {
            if (!(this.field_h > 0)) {
                this.field_h = this.field_l;
            }
            this.field_h = this.field_h - 1;
            this.field_n = false;
            this.field_o = true;
        }
        if (!(this.field_q != 0)) {
            this.field_d = wh.field_c;
        }
        if (0 == this.field_q) {
            if (!(-100 != (wh.field_c ^ -1))) {
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
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (param3 > 36) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      L3: {
                        if (param0) {
                          break L3;
                        } else {
                          field_b = (String) null;
                          break L3;
                        }
                      }
                      stackIn_40_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (0 == var8) {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param2) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (48 > var9) {
                              break L7;
                            } else {
                              if (57 < var9) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (65 > var9) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          stackIn_26_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (var9 < param3) {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = var9 + var6 * param3;
                          if (var10 / param3 == var6) {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          } else {
                            stackIn_34_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          stackIn_29_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("sk.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L11;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              return stackIn_40_0 != 0;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        if (param1 >= -52) {
            field_k = -122;
        }
        param0 = param0 & 8191;
        if (-4097 < (param0 ^ -1)) {
            return param0 < 2048 ? pd.field_i[param0] : pd.field_i[4096 - param0];
        }
        return -6145 >= (param0 ^ -1) ? -pd.field_i[-param0 + 8192] : -pd.field_i[-4096 + param0];
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
          if (param2 >= this.field_l) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              this.field_d = 0;
              this.field_p = 0;
              this.field_o = false;
              if (-1 == (ig.field_Yb ^ -1)) {
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
                if (-1 != (ig.field_Yb ^ -1)) {
                  break L3;
                } else {
                  if (-1 == (be.field_n ^ -1)) {
                    this.field_q = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (-1 != (this.field_q ^ -1)) {
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
                      if (this.field_h == param0) {
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
        if (param0 == 114) {
          L0: {
            L1: {
              if (0 != this.field_p) {
                break L1;
              } else {
                if (84 == this.field_d) {
                  break L1;
                } else {
                  if (-84 != (this.field_d ^ -1)) {
                    stackIn_8_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_8_0 = 1;
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
