/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uf extends htb {
    private int field_B;
    private boolean field_I;
    private long field_D;
    private long field_J;
    private boolean field_G;
    private int field_H;
    static java.awt.Frame field_E;
    private int field_C;
    static String field_F;
    private int field_K;

    private final void k(byte param0) {
        if (!(this.field_l instanceof en)) {
          if (param0 < 40) {
            field_E = (java.awt.Frame) null;
            return;
          } else {
            return;
          }
        } else {
          ((en) ((Object) this.field_l)).a(-12409, (uf) (this));
          if (param0 >= 40) {
            return;
          } else {
            field_E = (java.awt.Frame) null;
            return;
          }
        }
    }

    final static void a(String param0, int param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              od.field_a = od.field_a + 1;
              if (ela.field_o != -1) {
                break L1;
              } else {
                if (-1 == gi.field_b) {
                  gi.field_b = uia.field_b;
                  ela.field_o = kc.field_b;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  if (param0.equals(rfa.field_o)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != rfa.field_o) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!jib.field_o) {
                  if (fra.field_b <= od.field_a) {
                    if (od.field_a < fra.field_b - -k.field_r) {
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param0 == null) {
                  od.field_a = 0;
                  break L5;
                } else {
                  if (jib.field_o) {
                    od.field_a = fra.field_b;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      od.field_a = fra.field_b;
                      break L5;
                    } else {
                      od.field_a = 0;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param0 == null) {
                  if (var2_int == 0) {
                    break L6;
                  } else {
                    jib.field_o = true;
                    break L6;
                  }
                } else {
                  jib.field_o = false;
                  break L6;
                }
              }
              js.field_r = ela.field_o;
              tmb.field_o = gi.field_b;
              break L2;
            }
            L7: {
              rfa.field_o = param0;
              if (jib.field_o) {
                break L7;
              } else {
                if (od.field_a >= fra.field_b) {
                  break L7;
                } else {
                  if (upb.field_c) {
                    od.field_a = 0;
                    js.field_r = ela.field_o;
                    tmb.field_o = gi.field_b;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              if (!jib.field_o) {
                break L8;
              } else {
                if (ioa.field_o != od.field_a) {
                  break L8;
                } else {
                  jib.field_o = false;
                  od.field_a = 0;
                  break L8;
                }
              }
            }
            gi.field_b = -1;
            ela.field_o = -1;
            if (param1 == 5757) {
              break L0;
            } else {
              field_F = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var2);

            stackIn_43_1 = new StringBuilder().append("uf.P(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L9;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ')');
        }
    }

    private final int i(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        var2 = this.field_j.length();
        if (var2 == this.field_K) {
          return this.field_K;
        } else {
          var3 = this.field_K - -1;
          L0: while (true) {
            if (var2 > var3) {
              if (this.field_j.charAt(var3 - 1) != 32) {
                var3++;
                continue L0;
              } else {
                if (param0 != 62) {
                  return 60;
                } else {
                  return var3;
                }
              }
            } else {
              if (param0 != 62) {
                return 60;
              } else {
                return var3;
              }
            }
          }
        }
    }

    private final void g(byte param0) {
        int var3 = 0;
        int var2 = 0;
        if (this.field_K != this.field_H) {
            var2 = this.field_H < this.field_K ? this.field_H : this.field_K;
            var3 = this.field_H < this.field_K ? this.field_K : this.field_H;
            this.field_H = var2;
            this.field_K = var2;
            this.field_j = this.field_j.substring(0, var2) + this.field_j.substring(var3, this.field_j.length());
            this.i((byte) -55);
        }
        var2 = -86 / ((62 - param0) / 48);
    }

    private final void h(int param0) {
        ar var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        at var9;
        var8 = VoidHunters.field_G;
        if (!this.field_G) {
          this.field_s = 0;
          this.field_i = 0;
          return;
        } else {
          if (!(this.field_q instanceof at)) {
            return;
          } else {
            var9 = (at) ((Object) this.field_q);
            var3 = var9.a((shb) (this), 3);
            var4 = var3.c(-18877);
            var5 = var9.b((shb) (this), (byte) 114);
            var6 = var9.a(35) >> 391500161;
            if (-var6 + var5 <= var4) {
              if (param0 == 27151) {
                var7 = this.field_s - -var3.a(this.field_K, param0 ^ -27235);
                if (var7 > var5 - var6) {
                  this.field_s = var5 - (var6 + (var7 - this.field_s));
                  if ((this.field_s ^ -1) >= -1) {
                    if (this.field_s >= var6 + -var5) {
                      return;
                    } else {
                      this.field_s = -var5 - -var6;
                      return;
                    }
                  } else {
                    this.field_s = 0;
                    return;
                  }
                } else {
                  if (var6 <= var7) {
                    if ((this.field_s ^ -1) >= -1) {
                      if (this.field_s >= var6 + -var5) {
                        return;
                      } else {
                        this.field_s = -var5 - -var6;
                        return;
                      }
                    } else {
                      this.field_s = 0;
                      return;
                    }
                  } else {
                    this.field_s = this.field_s + var6 + -var7;
                    if ((this.field_s ^ -1) >= -1) {
                      if (this.field_s >= var6 + -var5) {
                        return;
                      } else {
                        this.field_s = -var5 - -var6;
                        return;
                      }
                    } else {
                      this.field_s = 0;
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              this.field_i = 0;
              this.field_s = 0;
              return;
            }
          }
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_J = wt.a(false);
              if (param0 == -15834) {
                break L1;
              } else {
                this.field_H = 81;
                break L1;
              }
            }
            L2: {
              if (param3 == 60) {
                break L2;
              } else {
                if (62 == param3) {
                  break L2;
                } else {
                  L3: {
                    if (param3 < 32) {
                      break L3;
                    } else {
                      if (param3 <= 126) {
                        L4: {
                          if (this.field_K == this.field_H) {
                            break L4;
                          } else {
                            this.g((byte) 120);
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (-1 == this.field_C) {
                              break L6;
                            } else {
                              if (this.field_j.length() < this.field_C) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (this.field_K < this.field_j.length()) {
                              this.field_j = this.field_j.substring(0, this.field_K) + param3 + this.field_j.substring(this.field_K, this.field_j.length());
                              this.field_K = this.field_K + 1;
                              this.field_H = this.field_K;
                              break L7;
                            } else {
                              this.field_j = this.field_j + param3;
                              dupTemp$0 = this.field_j.length();
                              this.field_K = dupTemp$0;
                              this.field_H = dupTemp$0;
                              break L7;
                            }
                          }
                          this.i((byte) -55);
                          break L5;
                        }
                        stackIn_74_0 = 1;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L8: {
                    if ((param1 ^ -1) == -86) {
                      if (this.field_K == this.field_H) {
                        if (0 >= this.field_K) {
                          break L8;
                        } else {
                          this.field_H = this.field_K + -1;
                          this.g((byte) 110);
                          stackIn_63_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        }
                      } else {
                        this.g((byte) 120);
                        stackIn_60_0 = 1;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      }
                    } else {
                      if (param1 != 101) {
                        if (-14 != (param1 ^ -1)) {
                          if ((param1 ^ -1) == -97) {
                            if (0 >= this.field_K) {
                              break L8;
                            } else {
                              L9: {
                                stackIn_55_0 = this;

                                if (si.field_o[82]) {
                                  stackIn_56_0 = this;
                                  stackIn_56_1 = this.g(param0 + 15834);
                                  break L9;
                                } else {
                                  stackIn_56_0 = this;
                                  stackIn_56_1 = -1 + this.field_K;
                                  break L9;
                                }
                              }
                              this.a(stackIn_56_1, (byte) -74);
                              stackIn_57_0 = 1;
                              decompiledRegionSelector0 = 11;
                              break L0;
                            }
                          } else {
                            if (-98 != (param1 ^ -1)) {
                              if (-103 != (param1 ^ -1)) {
                                if (-104 != (param1 ^ -1)) {
                                  if (-85 == (param1 ^ -1)) {
                                    this.k((byte) 68);
                                    stackIn_51_0 = 1;
                                    decompiledRegionSelector0 = 10;
                                    break L0;
                                  } else {
                                    L10: {
                                      if (!si.field_o[82]) {
                                        break L10;
                                      } else {
                                        if (param1 != 65) {
                                          break L10;
                                        } else {
                                          this.b(true);
                                          stackIn_39_0 = 1;
                                          decompiledRegionSelector0 = 7;
                                          break L0;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!si.field_o[82]) {
                                        break L11;
                                      } else {
                                        if ((param1 ^ -1) == -67) {
                                          this.l((byte) 24);
                                          stackIn_49_0 = 1;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    if (!si.field_o[82]) {
                                      break L8;
                                    } else {
                                      if (-68 == (param1 ^ -1)) {
                                        this.f(7328);
                                        stackIn_47_0 = 1;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      } else {
                                        return false;
                                      }
                                    }
                                  }
                                } else {
                                  this.a(this.field_j.length(), (byte) -100);
                                  stackIn_34_0 = 1;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                }
                              } else {
                                this.a(0, (byte) -96);
                                stackIn_31_0 = 1;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            } else {
                              if (this.field_K >= this.field_j.length()) {
                                break L8;
                              } else {
                                L12: {
                                  stackIn_26_0 = this;

                                  if (!si.field_o[82]) {
                                    stackIn_27_0 = this;
                                    stackIn_27_1 = this.field_K - -1;
                                    break L12;
                                  } else {
                                    stackIn_27_0 = this;
                                    stackIn_27_1 = this.i(62);
                                    break L12;
                                  }
                                }
                                this.a(stackIn_27_1, (byte) -58);
                                stackIn_28_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        } else {
                          this.e(82);
                          stackIn_20_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        if (this.field_H != this.field_K) {
                          this.g((byte) 112);
                          stackIn_17_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          if (this.field_K >= this.field_j.length()) {
                            break L8;
                          } else {
                            this.field_H = 1 + this.field_K;
                            this.g((byte) -38);
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  stackIn_76_0 = 0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var5);

            stackIn_79_1 = new StringBuilder().append("uf.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L13;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_34_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_39_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_47_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_49_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_51_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_57_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_60_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_63_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_74_0 != 0;
                                    } else {
                                      return stackIn_76_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 != null) {
                break L1;
              } else {
                param2 = "";
                break L1;
              }
            }
            L2: {
              this.field_j = param2;
              var4_int = param2.length();
              if ((this.field_C ^ -1) == param1) {
                break L2;
              } else {
                if (this.field_C < var4_int) {
                  this.field_j = this.field_j.substring(0, this.field_C);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            dupTemp$1 = this.field_j.length();
            this.field_H = dupTemp$1;
            this.field_K = dupTemp$1;
            if (param0) {
              break L0;
            } else {
              this.i((byte) -55);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("uf.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (0 == (this.field_C ^ -1)) {
                break L1;
              } else {
                var3_int = this.field_C - this.field_j.length();
                if (0 <= var3_int) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_K != this.field_j.length()) {
                this.field_j = this.field_j.substring(0, this.field_K) + param1 + this.field_j.substring(this.field_K, this.field_j.length());
                break L2;
              } else {
                this.field_j = this.field_j + param1;
                break L2;
              }
            }
            this.field_K = this.field_K + param1.length();
            var3_int = -69 % ((34 - param0) / 56);
            this.field_H = this.field_K;
            this.i((byte) -55);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("uf.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        long var6;
        at var8;
        at var10;
        at var11;
        if (param2 > 47) {
          if (this.field_q != null) {
            if (-1 == (param1 ^ -1)) {
              this.field_q.a(29, (shb) (this), param0, param3, this.field_x);
              if (this.field_q instanceof at) {
                L0: {
                  var11 = (at) ((Object) this.field_q);
                  if (this.field_H != this.field_K) {
                    var11.b(this.field_H, param3, -24184, param0, (shb) (this), this.field_K);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var6 = wt.a(false);
                if (((var6 + -this.field_J) % 1000L ^ -1L) <= -501L) {
                  return;
                } else {
                  var11.a((shb) (this), param3, (byte) 99, param0, this.field_K);
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
          this.g((byte) 89);
          if (this.field_q != null) {
            if (-1 == (param1 ^ -1)) {
              this.field_q.a(29, (shb) (this), param0, param3, this.field_x);
              if (this.field_q instanceof at) {
                L1: {
                  var10 = (at) ((Object) this.field_q);
                  var8 = var10;
                  if (this.field_H != this.field_K) {
                    var10.b(this.field_H, param3, -24184, param0, (shb) (this), this.field_K);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var6 = wt.a(false);
                if (((var6 + -this.field_J) % 1000L ^ -1L) <= -501L) {
                  return;
                } else {
                  var10.a((shb) (this), param3, (byte) 99, param0, this.field_K);
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

    uf(String param0, sba param1, int param2) {
        super(param0, param1);
        this.field_I = false;
        this.field_B = -1;
        this.field_D = 0L;
        try {
            this.field_C = param2;
            this.field_q = msa.field_s.field_o;
            this.a(true, 0, param0);
            this.field_G = true;
            this.field_J = wt.a(false);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, param2, param3, param4, param5, (byte) -61)) {
                break L1;
              } else {
                if (this.field_q instanceof at) {
                  L2: {
                    var8_int = ((at) ((Object) this.field_q)).a(kc.field_b, uia.field_b, param5, param1, (shb) (this), -1);
                    stackIn_5_0 = this;

                    if (0 == (var8_int ^ -1)) {
                      stackIn_6_0 = this;
                      stackIn_6_1 = 0;
                      break L2;
                    } else {
                      stackIn_6_0 = this;
                      stackIn_6_1 = var8_int;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_6_1, (byte) -84);
                    var8_long = wt.a(false);
                    stackIn_8_0 = this;

                    if (-251L >= (var8_long - this.field_D ^ -1L)) {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 0;
                      break L3;
                    } else {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    ((uf) (this)).field_I = stackIn_9_1 != 0;
                    if (this.field_I) {
                      L5: {
                        this.field_H = this.g(0);
                        this.field_K = this.i(62);
                        if (-1 <= (this.field_K ^ -1)) {
                          break L5;
                        } else {
                          if (this.field_j.charAt(this.field_K + -1) != 32) {
                            break L5;
                          } else {
                            this.field_K = this.field_K - 1;
                            break L5;
                          }
                        }
                      }
                      this.field_B = this.field_K;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_D = var8_long;
                  stackIn_16_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (param6 < -17) {
                break L6;
              } else {
                this.k((byte) 59);
                break L6;
              }
            }
            stackIn_20_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var8);

            stackIn_23_1 = new StringBuilder().append("uf.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    private final int g(int param0) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        if (param0 != this.field_K) {
          var2 = -1 + this.field_K;
          L0: while (true) {
            if (var2 > 0) {
              if (this.field_j.charAt(var2 + -1) != 32) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return this.field_K;
        }
    }

    void a(int param0, int param1, int param2, shb param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        at var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2 ^ 0, param3);
              this.h(param2 ^ -27100);
              if (param2 == -981) {
                break L1;
              } else {
                this.field_J = -63L;
                break L1;
              }
            }
            L2: {
              if (-2 != (this.field_n ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (this.field_q instanceof at) {
                    var7 = (at) ((Object) this.field_q);
                    var6 = var7.a(kc.field_b, uia.field_b, param0, param1, (shb) (this), param2 + 980);
                    if (0 == (var6 ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        if (!this.field_I) {
                          break L4;
                        } else {
                          if (var6 >= this.field_B) {
                            break L4;
                          } else {
                            if (this.field_H < var6) {
                              var6 = this.field_B;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_K = var6;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                this.field_J = wt.a(false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("uf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    private final void f(int param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.g((byte) -121);
                if (param0 == 7328) {
                  this.a(96, var2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(byte param0) {
        field_F = null;
        int var1 = -24 % ((-63 - param0) / 45);
        field_E = null;
    }

    private final void l(byte param0) {
        try {
            String var2;
            if (param0 == 24) {
              var2 = this.j((byte) -96);
              if (var2.length() > 0) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j((byte) -96))), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              } else {
                return;
              }
            } else {
              this.b(true);
              var2 = this.j((byte) -96);
              if (var2.length() <= 0) {
                return;
              } else {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j((byte) -96))), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, byte param1) {
        this.field_K = param0;
        if (param1 > -35) {
          L0: {
            this.b(false);
            if (!si.field_o[81]) {
              this.field_H = this.field_K;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!si.field_o[81]) {
              this.field_H = this.field_K;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void e(int param0) {
        String var3;
        this.field_K = 0;
        if (param0 != 82) {
          var3 = (String) null;
          this.a(32, (String) null);
          this.field_H = 0;
          this.field_j = "";
          this.i((byte) -55);
          return;
        } else {
          this.field_H = 0;
          this.field_j = "";
          this.i((byte) -55);
          return;
        }
    }

    private final String j(byte param0) {
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        if (param0 != -96) {
          return (String) null;
        } else {
          L0: {
            if (this.field_H >= this.field_K) {
              stackIn_4_0 = this.field_K;
              break L0;
            } else {
              stackIn_4_0 = this.field_H;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (this.field_H >= this.field_K) {
              stackIn_7_0 = this.field_H;
              break L1;
            } else {
              stackIn_7_0 = this.field_K;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_j.substring(var2, var3);
        }
    }

    void i(byte param0) {
        L0: {
          if (this.field_l instanceof en) {
            ((en) ((Object) this.field_l)).a((uf) (this), (byte) 100);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -55) {
          this.field_H = -20;
          return;
        } else {
          return;
        }
    }

    private final void b(boolean param0) {
        this.l((byte) 24);
        this.g((byte) 116);
        if (!param0) {
            field_F = (String) null;
        }
    }

    static {
        ns discarded$0 = new ns();
        field_F = "Weapon";
    }
}
