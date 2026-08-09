/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bm extends mi {
    static Object field_C;
    private int field_H;
    private int field_A;
    private long field_E;
    private boolean field_G;
    static ia field_x;
    private int field_B;
    private boolean field_y;
    private int field_D;
    private long field_F;
    static rk field_I;
    static int field_z;
    static int[] field_w;

    final boolean a(int param0, int param1, char param2, ea param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_54_0 = 0;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = 127 / ((param0 - -53) / 33);
              this.field_F = kh.a(-97);
              if (60 == param2) {
                break L1;
              } else {
                if (param2 == 62) {
                  break L1;
                } else {
                  L2: {
                    if (param2 < 32) {
                      break L2;
                    } else {
                      if (param2 <= 126) {
                        L3: {
                          if (this.field_B == this.field_D) {
                            break L3;
                          } else {
                            this.a((byte) -127);
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if ((this.field_H ^ -1) == 0) {
                              break L5;
                            } else {
                              if (this.field_f.length() >= this.field_H) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (this.field_B >= this.field_f.length()) {
                              this.field_f = this.field_f + param2;
                              dupTemp$0 = this.field_f.length();
                              this.field_B = dupTemp$0;
                              this.field_D = dupTemp$0;
                              break L6;
                            } else {
                              this.field_f = this.field_f.substring(0, this.field_B) + param2 + this.field_f.substring(this.field_B, this.field_f.length());
                              this.field_B = this.field_B + 1;
                              this.field_D = this.field_B;
                              break L6;
                            }
                          }
                          this.g((byte) -75);
                          break L4;
                        }
                        stackIn_73_0 = 1;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L7: {
                    if (param1 != 85) {
                      if ((param1 ^ -1) != -102) {
                        if (-14 == (param1 ^ -1)) {
                          this.f((byte) -2);
                          stackIn_62_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          if (-97 == (param1 ^ -1)) {
                            if (-1 <= (this.field_B ^ -1)) {
                              break L7;
                            } else {
                              L8: {
                                stackIn_58_0 = this;

                                stackIn_58_1 = 120;

                                if (lp.field_a[82]) {
                                  stackIn_59_0 = this;
                                  stackIn_59_1 = stackIn_58_1;
                                  stackIn_59_2 = this.e((byte) 76);
                                  break L8;
                                } else {
                                  stackIn_59_0 = this;
                                  stackIn_59_1 = stackIn_58_1;
                                  stackIn_59_2 = -1 + this.field_B;
                                  break L8;
                                }
                              }
                              this.a((byte) stackIn_59_1, stackIn_59_2);
                              stackIn_60_0 = 1;
                              decompiledRegionSelector0 = 12;
                              break L0;
                            }
                          } else {
                            if (-98 == (param1 ^ -1)) {
                              if (this.field_B < this.field_f.length()) {
                                L9: {
                                  stackIn_52_0 = this;

                                  stackIn_52_1 = 53;

                                  if (!lp.field_a[82]) {
                                    stackIn_53_0 = this;
                                    stackIn_53_1 = stackIn_52_1;
                                    stackIn_53_2 = 1 + this.field_B;
                                    break L9;
                                  } else {
                                    stackIn_53_0 = this;
                                    stackIn_53_1 = stackIn_52_1;
                                    stackIn_53_2 = this.k(0);
                                    break L9;
                                  }
                                }
                                this.a((byte) stackIn_53_1, stackIn_53_2);
                                stackIn_54_0 = 1;
                                decompiledRegionSelector0 = 11;
                                break L0;
                              } else {
                                break L7;
                              }
                            } else {
                              if (102 != param1) {
                                if (-104 != (param1 ^ -1)) {
                                  if (-85 != (param1 ^ -1)) {
                                    L10: {
                                      if (!lp.field_a[82]) {
                                        break L10;
                                      } else {
                                        if ((param1 ^ -1) == -66) {
                                          this.b(true);
                                          stackIn_47_0 = 1;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!lp.field_a[82]) {
                                        break L11;
                                      } else {
                                        if (param1 != 66) {
                                          break L11;
                                        } else {
                                          this.i(-116);
                                          stackIn_41_0 = 1;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!lp.field_a[82]) {
                                      break L7;
                                    } else {
                                      if (67 != param1) {
                                        break L7;
                                      } else {
                                        this.l(-1);
                                        stackIn_45_0 = 1;
                                        decompiledRegionSelector0 = 9;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.j(-1);
                                    stackIn_34_0 = 1;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  }
                                } else {
                                  this.a((byte) 59, this.field_f.length());
                                  stackIn_31_0 = 1;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                }
                              } else {
                                this.a((byte) 69, 0);
                                stackIn_28_0 = 1;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_D != this.field_B) {
                          this.a((byte) -87);
                          stackIn_22_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (this.field_B < this.field_f.length()) {
                            this.field_D = 1 + this.field_B;
                            this.a((byte) 43);
                            stackIn_20_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            return false;
                          }
                        }
                      }
                    } else {
                      if (this.field_D != this.field_B) {
                        this.a((byte) -118);
                        stackIn_14_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((this.field_B ^ -1) >= -1) {
                          break L7;
                        } else {
                          this.field_D = this.field_B - 1;
                          this.a((byte) 14);
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_75_0 = 0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_78_0 = (RuntimeException) (var5);

            stackIn_78_1 = new StringBuilder().append("bm.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L12;
            } else {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L12;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_28_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_31_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_34_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_41_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_45_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_47_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_54_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_60_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_62_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_73_0 != 0;
                                    } else {
                                      return stackIn_75_0 != 0;
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

    private final void l(int param0) {
        try {
            Exception exception = null;
            String var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.a((byte) -81);
                this.a(var2, (byte) 126);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
            if (param0 != -1) {
              field_I = (rk) null;
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

    final static java.applet.Applet m(int param0) {
        if (param0 < 106) {
            al var2 = (al) null;
            bm.a((byte) -67, (al) null);
            if (!(hu.field_a == null)) {
                return hu.field_a;
            }
            return (java.applet.Applet) ((Object) gh.field_f);
        }
        if (!(hu.field_a == null)) {
            return hu.field_a;
        }
        return (java.applet.Applet) ((Object) gh.field_f);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (this.field_B != 0) {
          var3 = 85 % ((param0 - 13) / 39);
          var2 = -1 + this.field_B;
          L0: while (true) {
            if (var2 > 0) {
              if (-33 != (this.field_f.charAt(-1 + var2) ^ -1)) {
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
          return this.field_B;
        }
    }

    final void a(int param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            this.field_f = param1;
            if (param0 == -20975) {
              L2: {
                var4_int = param1.length();
                if (this.field_H == -1) {
                  break L2;
                } else {
                  if (this.field_H < var4_int) {
                    this.field_f = this.field_f.substring(0, this.field_H);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              dupTemp$1 = this.field_f.length();
              this.field_D = dupTemp$1;
              this.field_B = dupTemp$1;
              if (param2) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.g((byte) -75);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("bm.RA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static rh a(byte param0, al param1) {
        RuntimeException var2 = null;
        rh stackIn_2_0 = null;
        rh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -70) {
              stackIn_4_0 = am.a(param1, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (rh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("bm.UA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        long var6;
        et var8;
        if (null != this.field_e) {
          if (param1 == 0) {
            this.field_e.a(this.field_u, -7592, param3, (ea) (this), param2);
            if (this.field_e instanceof et) {
              var8 = (et) ((Object) this.field_e);
              if (this.field_D == this.field_B) {
                var6 = kh.a(-62);
                if ((-this.field_F + var6) % 1000L < 500L) {
                  var8.a((byte) 71, param3, param2, this.field_B, (ea) (this));
                  if (param0 <= 64) {
                    discarded$0 = this.k(125);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param0 <= 64) {
                    discarded$1 = this.k(125);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var8.a(this.field_D, this.field_B, param2, param3, (ea) (this), (byte) -123);
                var6 = kh.a(-62);
                if ((-this.field_F + var6) % 1000L >= 500L) {
                  if (param0 <= 64) {
                    discarded$2 = this.k(125);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var8.a((byte) 71, param3, param2, this.field_B, (ea) (this));
                  if (param0 <= 64) {
                    discarded$3 = this.k(125);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0 <= 64) {
                discarded$4 = this.k(125);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 > 64) {
              return;
            } else {
              discarded$5 = this.k(125);
              return;
            }
          }
        } else {
          if (param0 <= 64) {
            discarded$6 = this.k(125);
            return;
          } else {
            return;
          }
        }
    }

    void g(byte param0) {
        L0: {
          if (this.field_o instanceof dr) {
            ((dr) ((Object) this.field_o)).a((bm) (this), -6525);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -75) {
          field_I = (rk) null;
          return;
        } else {
          return;
        }
    }

    bm(String param0, no param1, int param2) {
        super(param0, param1);
        this.field_E = 0L;
        this.field_A = -1;
        this.field_G = false;
        try {
            this.field_H = param2;
            this.field_e = ag.field_n.field_n;
            this.a(-20975, param0, true);
            this.field_y = true;
            this.field_F = kh.a(-88);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0) {
        ea var3;
        this.i(-120);
        if (!param0) {
          var3 = (ea) null;
          this.a(9, 25, 35, 10, 41, (ea) null, -23);
          this.a((byte) -85);
          return;
        } else {
          this.a((byte) -85);
          return;
        }
    }

    private final void a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -51 / ((-40 - param0) / 32);
        if (this.field_B != this.field_D) {
            var3 = this.field_B <= this.field_D ? this.field_B : this.field_D;
            var4 = this.field_B > this.field_D ? this.field_B : this.field_D;
            this.field_D = var3;
            this.field_B = var3;
            this.field_f = this.field_f.substring(0, var3) + this.field_f.substring(var4, this.field_f.length());
            this.g((byte) -75);
        }
    }

    private final void h(int param0) {
        pp var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        et var9;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (!this.field_y) {
          this.field_j = 0;
          this.field_l = 0;
          return;
        } else {
          if (!(this.field_e instanceof et)) {
            return;
          } else {
            var9 = (et) ((Object) this.field_e);
            var3 = var9.a((byte) 96, (ea) (this));
            var4 = var3.a((byte) 24);
            var5 = var9.b((ea) (this), -64);
            var6 = var9.a(-4) >> -1911304799;
            if (var4 < -var6 + var5) {
              this.field_l = 0;
              this.field_j = 0;
              return;
            } else {
              var7 = this.field_j + var3.b(this.field_B, -127);
              if (var5 - var6 < var7) {
                this.field_j = -var7 + -var6 + (var5 + this.field_j);
                if (param0 >= this.field_j) {
                  if (-var5 - -var6 <= this.field_j) {
                    return;
                  } else {
                    this.field_j = -var5 + var6;
                    return;
                  }
                } else {
                  this.field_j = 0;
                  return;
                }
              } else {
                if (var6 <= var7) {
                  if (param0 >= this.field_j) {
                    if (-var5 - -var6 <= this.field_j) {
                      return;
                    } else {
                      this.field_j = -var5 + var6;
                      return;
                    }
                  } else {
                    this.field_j = 0;
                    return;
                  }
                } else {
                  this.field_j = this.field_j - -var6 - var7;
                  if (param0 >= this.field_j) {
                    if (-var5 - -var6 <= this.field_j) {
                      return;
                    } else {
                      this.field_j = -var5 + var6;
                      return;
                    }
                  } else {
                    this.field_j = 0;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        this.field_B = param1;
        if (param0 <= 30) {
          L0: {
            this.field_F = 35L;
            if (!lp.field_a[81]) {
              this.field_D = this.field_B;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!lp.field_a[81]) {
              this.field_D = this.field_B;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        et var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a((byte) 126, param1, param2, param3);
              if (param0 > 13) {
                break L1;
              } else {
                this.field_B = -1;
                break L1;
              }
            }
            L2: {
              this.h(0);
              if (this.field_i != 1) {
                break L2;
              } else {
                L3: {
                  if (this.field_e instanceof et) {
                    var7 = (et) ((Object) this.field_e);
                    var6 = var7.a((ea) (this), param3, param2, cf.field_g, 3, ic.field_b);
                    if (-1 != var6) {
                      L4: {
                        if (!this.field_G) {
                          break L4;
                        } else {
                          if (var6 >= this.field_A) {
                            break L4;
                          } else {
                            if (var6 > this.field_D) {
                              var6 = this.field_A;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_B = var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                this.field_F = kh.a(-60);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (runtimeException);

            stackIn_17_1 = new StringBuilder().append("bm.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void d(byte param0) {
        al var2;
        if (param0 >= -33) {
          var2 = (al) null;
          bm.a((byte) -72, (al) null);
          field_x = null;
          field_I = null;
          field_C = null;
          field_w = null;
          return;
        } else {
          field_x = null;
          field_I = null;
          field_C = null;
          field_w = null;
          return;
        }
    }

    private final void j(int param0) {
        if (param0 != -1) {
          L0: {
            this.field_A = 14;
            if (this.field_o instanceof dr) {
              ((dr) ((Object) this.field_o)).b((bm) (this), -40);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_o instanceof dr) {
              ((dr) ((Object) this.field_o)).b((bm) (this), -40);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final int k(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var2 = this.field_f.length();
        if (param0 == 0) {
          if (var2 != this.field_B) {
            var3 = 1 + this.field_B;
            L0: while (true) {
              if (var2 > var3) {
                if (this.field_f.charAt(-1 + var3) != 32) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return this.field_B;
          }
        } else {
          return -109;
        }
    }

    final void f(byte param0) {
        this.field_f = "";
        this.field_B = 0;
        this.field_D = 0;
        this.g((byte) -75);
        if (param0 != -2) {
            this.field_y = false;
        }
    }

    private final void i(int param0) {
        try {
            String var2;
            if (param0 <= -98) {
              var2 = this.h((byte) 97);
              if (-1 > (var2.length() ^ -1)) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h((byte) 109))), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              } else {
                return;
              }
            } else {
              this.field_D = -50;
              var2 = this.h((byte) 97);
              if (-1 <= (var2.length() ^ -1)) {
                return;
              } else {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h((byte) 109))), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if ((this.field_H ^ -1) != 0) {
            var3_int = this.field_H + -this.field_f.length();
            if (!(-1 < (var3_int ^ -1))) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (this.field_B == this.field_f.length()) {
            this.field_f = this.field_f + param0;
        } else {
            this.field_f = this.field_f.substring(0, this.field_B) + param0 + this.field_f.substring(this.field_B, this.field_f.length());
        }
        if (param1 <= 120) {
            return;
        }
        try {
            this.field_B = this.field_B + param0.length();
            this.field_D = this.field_B;
            this.g((byte) -75);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bm.VA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final String h(byte param0) {
        int var2;
        int var3;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        L0: {
          if (this.field_D >= this.field_B) {
            stackIn_3_0 = this.field_B;
            break L0;
          } else {
            stackIn_3_0 = this.field_D;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 <= 80) {
          L1: {
            this.a((byte) 107, -41, -122, -11);
            if (this.field_D >= this.field_B) {
              stackIn_11_0 = this.field_D;
              break L1;
            } else {
              stackIn_11_0 = this.field_B;
              break L1;
            }
          }
          var3 = stackIn_11_0;
          return this.field_f.substring(var2, var3);
        } else {
          L2: {
            if (this.field_D >= this.field_B) {
              stackIn_7_0 = this.field_D;
              break L2;
            } else {
              stackIn_7_0 = this.field_B;
              break L2;
            }
          }
          var3 = stackIn_7_0;
          return this.field_f.substring(var2, var3);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            if (super.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
              if (this.field_e instanceof et) {
                L1: {
                  var8_int = ((et) ((Object) this.field_e)).a((ea) (this), param1, param4, cf.field_g, param0 + -31, ic.field_b);
                  stackIn_6_0 = this;

                  stackIn_6_1 = 82;

                  if (var8_int == -1) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = var8_int;
                    break L1;
                  }
                }
                L2: {
                  this.a((byte) stackIn_7_1, stackIn_7_2);
                  var8_long = kh.a(param0 + -125);
                  stackIn_9_0 = this;

                  if ((var8_long + -this.field_E ^ -1L) <= -251L) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((bm) (this)).field_G = stackIn_10_1 != 0;
                  if (!this.field_G) {
                    break L3;
                  } else {
                    L4: {
                      this.field_D = this.e((byte) 97);
                      this.field_B = this.k(0);
                      if ((this.field_B ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (this.field_f.charAt(this.field_B + -1) != 32) {
                          break L4;
                        } else {
                          this.field_B = this.field_B - 1;
                          break L4;
                        }
                      }
                    }
                    this.field_A = this.field_B;
                    break L3;
                  }
                }
                this.field_E = var8_long;
                stackIn_16_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackIn_18_0 = 0;
                decompiledRegionSelector0 = 1;
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
            stackIn_21_0 = (RuntimeException) (var8);

            stackIn_21_1 = new StringBuilder().append("bm.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    static {
        field_x = new ia();
        field_w = new int[4];
    }
}
