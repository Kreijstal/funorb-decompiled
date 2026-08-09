/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ba extends wd {
    private boolean field_H;
    static tj field_E;
    private boolean field_C;
    private long field_L;
    private int field_F;
    private int field_D;
    static boolean field_B;
    private int field_K;
    private long field_J;
    static boolean field_I;
    private int field_G;

    private final void b(int param0, int param1) {
        this.field_G = param0;
        if (!ng.field_a[81]) {
            this.field_K = this.field_G;
        }
        if (param1 != 102) {
            this.field_C = true;
        }
    }

    private final void i(int param0) {
        if (param0 != 30483) {
            this.h(-108);
        }
        if (this.field_n instanceof gl) {
            ((gl) ((Object) this.field_n)).a((byte) -51, (ba) (this));
        }
    }

    private final String j(int param0) {
        int var2 = this.field_G > this.field_K ? this.field_K : this.field_G;
        int var4 = -121 % ((param0 - -61) / 36);
        int var3 = this.field_K >= this.field_G ? this.field_K : this.field_G;
        return this.field_h.substring(var2, var3);
    }

    private final void f(byte param0) {
        int var2 = -116 % ((param0 - -25) / 63);
        this.i((byte) 84);
        this.b(true);
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!param0) {
            return;
        }
        if (!(this.field_K == this.field_G)) {
            var2 = this.field_G > this.field_K ? this.field_K : this.field_G;
            var3 = this.field_G > this.field_K ? this.field_G : this.field_K;
            this.field_K = var2;
            this.field_G = var2;
            this.field_h = this.field_h.substring(0, var2) + this.field_h.substring(var3, this.field_h.length());
            this.h((byte) 88);
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        if (!(this.field_D == -1)) {
            var3_int = this.field_D + -this.field_h.length();
            if (-1 >= (var3_int ^ -1)) {
                return;
            }
            param1 = param1.substring(0, var3_int);
        }
        if (this.field_G == this.field_h.length()) {
            this.field_h = this.field_h + param1;
        } else {
            this.field_h = this.field_h.substring(0, this.field_G) + param1 + this.field_h.substring(this.field_G, this.field_h.length());
        }
        this.field_G = this.field_G + param1.length();
        this.field_K = this.field_G;
        if (param0 != 28383) {
            return;
        }
        try {
            this.h((byte) 88);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ba.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, String param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        lk var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                param1 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2) {
                break L2;
              } else {
                var5 = (lk) null;
                this.a(32, -52, -24, (lk) null);
                break L2;
              }
            }
            L3: {
              this.field_h = param1;
              var4_int = param1.length();
              if (this.field_D == -1) {
                break L3;
              } else {
                if (var4_int > this.field_D) {
                  this.field_h = this.field_h.substring(0, this.field_D);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$2 = this.field_h.length();
              this.field_K = dupTemp$2;
              this.field_G = dupTemp$2;
              if (!param0) {
                this.h((byte) 88);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ba.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    private final void g(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            int var2_int = 0;
            Exception var2 = null;
            String var3 = null;
            try {
              L0: {
                var2_int = 12 % ((param0 - 66) / 57);
                var3 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.b(true);
                this.a(28383, var3);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void h(byte param0) {
        if (this.field_n instanceof gl) {
            ((gl) ((Object) this.field_n)).a((ba) (this), (byte) 98);
        }
        if (param0 != 88) {
            ba.a((byte) -91, 122L);
        }
    }

    void a(int param0, int param1, int param2, lk param3) {
        sf var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.e((byte) 126);
              if (1 == this.field_u) {
                L2: {
                  if (!(this.field_j instanceof sf)) {
                    break L2;
                  } else {
                    var5 = (sf) ((Object) this.field_j);
                    var6 = var5.a((lk) (this), param2, ll.field_y, param1, param0 + -57, uc.field_C);
                    if (-1 == var6) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_C) {
                          break L3;
                        } else {
                          if (this.field_F <= var6) {
                            break L3;
                          } else {
                            if (var6 <= this.field_K) {
                              break L3;
                            } else {
                              var6 = this.field_F;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_G = var6;
                      break L2;
                    }
                  }
                }
                this.field_L = fa.a(-55);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5_ref);

            stackIn_13_1 = new StringBuilder().append("ba.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    ba(String param0, sk param1, int param2) {
        super(param0, param1);
        this.field_J = 0L;
        this.field_F = -1;
        this.field_C = false;
        try {
            this.field_D = param2;
            this.field_j = ma.field_m.field_e;
            this.a(true, param0, true);
            this.field_H = true;
            this.field_L = fa.a(-96);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Bounce.field_N;
        if (param0 >= 44) {
          var2 = this.field_h.length();
          if (var2 != this.field_G) {
            var3 = 1 + this.field_G;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (32 == this.field_h.charAt(var3 + -1)) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          } else {
            return this.field_G;
          }
        } else {
          return -111;
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_45_0 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
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
              this.field_L = fa.a(param3 + 14452);
              if (param1 == 60) {
                break L1;
              } else {
                if (62 == param1) {
                  break L1;
                } else {
                  L2: {
                    if (param3 == -14565) {
                      break L2;
                    } else {
                      this.h((byte) -70);
                      break L2;
                    }
                  }
                  L3: {
                    if (param1 < 32) {
                      break L3;
                    } else {
                      if (param1 > 126) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_G == this.field_K) {
                            break L4;
                          } else {
                            this.b(true);
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (0 == (this.field_D ^ -1)) {
                              break L6;
                            } else {
                              if (this.field_h.length() >= this.field_D) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (this.field_G < this.field_h.length()) {
                              this.field_h = this.field_h.substring(0, this.field_G) + param1 + this.field_h.substring(this.field_G, this.field_h.length());
                              this.field_G = this.field_G + 1;
                              this.field_K = this.field_G;
                              break L7;
                            } else {
                              this.field_h = this.field_h + param1;
                              dupTemp$0 = this.field_h.length();
                              this.field_G = dupTemp$0;
                              this.field_K = dupTemp$0;
                              break L7;
                            }
                          }
                          this.h((byte) 88);
                          break L5;
                        }
                        stackIn_19_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  if (-86 != (param2 ^ -1)) {
                    L8: {
                      if (param2 != 101) {
                        if (13 != param2) {
                          if (-97 != (param2 ^ -1)) {
                            if (param2 != 97) {
                              if (102 == param2) {
                                this.b(0, 102);
                                stackIn_74_0 = 1;
                                decompiledRegionSelector0 = 14;
                                break L0;
                              } else {
                                if (103 != param2) {
                                  if (param2 == 84) {
                                    this.i(30483);
                                    stackIn_72_0 = 1;
                                    decompiledRegionSelector0 = 13;
                                    break L0;
                                  } else {
                                    L9: {
                                      if (!ng.field_a[82]) {
                                        break L9;
                                      } else {
                                        if ((param2 ^ -1) == -66) {
                                          this.f((byte) 107);
                                          stackIn_70_0 = 1;
                                          decompiledRegionSelector0 = 12;
                                          break L0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!ng.field_a[82]) {
                                        break L10;
                                      } else {
                                        if ((param2 ^ -1) != -67) {
                                          break L10;
                                        } else {
                                          this.i((byte) 103);
                                          stackIn_64_0 = 1;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!ng.field_a[82]) {
                                      break L8;
                                    } else {
                                      if (param2 != 67) {
                                        break L8;
                                      } else {
                                        this.g((byte) -11);
                                        stackIn_68_0 = 1;
                                        decompiledRegionSelector0 = 11;
                                        break L0;
                                      }
                                    }
                                  }
                                } else {
                                  this.b(this.field_h.length(), 102);
                                  stackIn_56_0 = 1;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                }
                              }
                            } else {
                              if (this.field_G >= this.field_h.length()) {
                                break L8;
                              } else {
                                L11: {
                                  stackIn_50_0 = this;

                                  if (ng.field_a[82]) {
                                    stackIn_51_0 = this;
                                    stackIn_51_1 = this.a(param3 + 14657);
                                    break L11;
                                  } else {
                                    stackIn_51_0 = this;
                                    stackIn_51_1 = this.field_G - -1;
                                    break L11;
                                  }
                                }
                                this.b(stackIn_51_1, param3 + 14667);
                                stackIn_52_0 = 1;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              }
                            }
                          } else {
                            if (-1 <= (this.field_G ^ -1)) {
                              break L8;
                            } else {
                              L12: {
                                stackIn_43_0 = this;

                                if (!ng.field_a[82]) {
                                  stackIn_44_0 = this;
                                  stackIn_44_1 = -1 + this.field_G;
                                  break L12;
                                } else {
                                  stackIn_44_0 = this;
                                  stackIn_44_1 = this.k(param3 ^ -14565);
                                  break L12;
                                }
                              }
                              this.b(stackIn_44_1, param3 ^ -14467);
                              stackIn_45_0 = 1;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          }
                        } else {
                          this.h(123);
                          stackIn_38_0 = 1;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        if (this.field_K != this.field_G) {
                          this.b(true);
                          stackIn_35_0 = 1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (this.field_G < this.field_h.length()) {
                            this.field_K = this.field_G + 1;
                            this.b(true);
                            stackIn_33_0 = 1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    stackIn_76_0 = 0;
                    decompiledRegionSelector0 = 15;
                    break L0;
                  } else {
                    if (this.field_K != this.field_G) {
                      this.b(true);
                      stackIn_27_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (0 < this.field_G) {
                        this.field_K = -1 + this.field_G;
                        this.b(true);
                        stackIn_25_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var5);

            stackIn_79_1 = new StringBuilder().append("ba.E(");

            if (param0 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_33_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_38_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_45_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_52_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_56_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_64_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_68_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_70_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_72_0 != 0;
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

    final void h(int param0) {
        this.field_G = 0;
        this.field_h = "";
        this.field_K = 0;
        this.h((byte) 88);
        if (param0 <= 107) {
            lk var3 = (lk) null;
            this.a(120, -64, -29, (lk) null);
        }
    }

    private final void e(byte param0) {
        ed var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        sf var9;
        var8 = Bounce.field_N;
        if (!this.field_H) {
          this.field_v = 0;
          this.field_o = 0;
          return;
        } else {
          if (this.field_j instanceof sf) {
            L0: {
              var9 = (sf) ((Object) this.field_j);
              if (param0 > 102) {
                break L0;
              } else {
                this.field_D = -65;
                break L0;
              }
            }
            var3 = var9.b((lk) (this), 0);
            var4 = var3.b(106);
            var5 = var9.a((lk) (this), (byte) -55);
            var6 = var9.a(68) >> 1651627489;
            if (-var6 + var5 > var4) {
              this.field_o = 0;
              this.field_v = 0;
              return;
            } else {
              L1: {
                var7 = this.field_v - -var3.a(this.field_G, 81);
                if (-var6 + var5 >= var7) {
                  if (var6 > var7) {
                    this.field_v = this.field_v - (var7 + -var6);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_v = this.field_v + (-var7 + (var5 + -var6));
                  break L1;
                }
              }
              L2: {
                if (0 >= this.field_v) {
                  if (-var5 + var6 <= this.field_v) {
                    break L2;
                  } else {
                    this.field_v = var6 + -var5;
                    break L2;
                  }
                } else {
                  this.field_v = 0;
                  break L2;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    private final int k(int param0) {
        int var2;
        int var3;
        var3 = Bounce.field_N;
        if (param0 == this.field_G) {
          return this.field_G;
        } else {
          var2 = -1 + this.field_G;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (this.field_h.charAt(var2 - 1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        }
    }

    final static void a(byte param0, long param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            try {
              L0: {
                L1: {
                  Thread.sleep(param1);
                  if (param0 <= -29) {
                    break L1;
                  } else {
                    ba.a((byte) 115, 7L);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (!(this.field_j instanceof sf)) {
                stackIn_19_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var8_int = ((sf) ((Object) this.field_j)).a((lk) (this), param6, ll.field_y, param2, -66, uc.field_C);
                  stackIn_5_0 = this;

                  if (-1 == var8_int) {
                    stackIn_6_0 = this;
                    stackIn_6_1 = 0;
                    break L1;
                  } else {
                    stackIn_6_0 = this;
                    stackIn_6_1 = var8_int;
                    break L1;
                  }
                }
                L2: {
                  this.b(stackIn_6_1, param4 ^ 28481);
                  var8_long = fa.a(-99);
                  stackIn_8_0 = this;

                  if (var8_long + -this.field_J >= 250L) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 0;
                    break L2;
                  } else {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((ba) (this)).field_C = stackIn_9_1 != 0;
                  if (this.field_C) {
                    L4: {
                      this.field_K = this.k(param4 + -28455);
                      this.field_G = this.a(116);
                      if ((this.field_G ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (this.field_h.charAt(-1 + this.field_G) == 32) {
                          this.field_G = this.field_G - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_F = this.field_G;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_J = var8_long;
                stackIn_17_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("ba.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    public static void d(byte param0) {
        if (param0 <= 69) {
            return;
        }
        field_E = null;
    }

    private final void i(byte param0) {
        int var2 = 89 % ((-11 - param0) / 49);
        String var3 = this.j(65);
        if (!((var3.length() ^ -1) >= -1)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j(-116))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        sf var8 = null;
        long var6 = 0L;
        if (null != this.field_j) {
            if (!(param0 != 0)) {
                this.field_j.a(param1, (lk) (this), (byte) 91, this.field_y, param3);
                if (!(!(this.field_j instanceof sf))) {
                    var8 = (sf) ((Object) this.field_j);
                    if (this.field_G != this.field_K) {
                        var8.a(param3, (lk) (this), param1, this.field_G, this.field_K, (byte) 87);
                    }
                    var6 = fa.a(-84);
                    if (!(((-this.field_L + var6) % 1000L ^ -1L) <= -501L)) {
                        var8.a((lk) (this), this.field_G, (byte) 65, param1, param3);
                    }
                }
            }
        }
        if (param2 <= 33) {
            this.field_H = true;
        }
    }

    static {
    }
}
