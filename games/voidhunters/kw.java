/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw extends llb {
    private int field_vb;
    private eab field_Db;
    private llb field_Cb;
    private boolean field_zb;
    private StringBuilder field_Eb;
    private boolean field_Bb;
    private int field_Ab;
    private long field_wb;
    private int field_Hb;
    llb field_Fb;
    private llb field_Kb;
    static gj field_xb;
    private int field_yb;
    static String field_Jb;
    private int field_Gb;
    private mob field_Ib;

    public static void g(byte param0) {
        if (param0 != 124) {
            kw.g((byte) 112);
        }
        field_xb = null;
        field_Jb = null;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        StringBuilder discarded$0 = null;
        int dupTemp$1 = 0;
        try {
            if (param1 > -85) {
                eab var4 = (eab) null;
                this.a(30, (eab) null);
            }
            this.field_Eb.setLength(0);
            var3_int = param0.length();
            if ((this.field_yb ^ -1) != 0) {
                if (!(this.field_yb >= var3_int)) {
                    var3_int = this.field_yb;
                }
            }
            discarded$0 = this.field_Eb.append(param0.substring(0, var3_int));
            dupTemp$1 = this.field_Eb.length();
            this.field_Gb = dupTemp$1;
            this.field_Ab = dupTemp$1;
            this.field_Fb.field_R = this.field_Eb.toString();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kw.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param0 > -14) {
            String var4 = (String) null;
            this.a((String) null, -20);
        }
        this.field_Ab = param1;
        this.field_Gb = param1;
    }

    final void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        int var5 = VoidHunters.field_G;
        int var4 = this.field_Eb.length();
        if (-1 < (param2 ^ -1)) {
            param2 = 0;
        } else {
            if (!(param2 <= var4)) {
                param2 = var4;
            }
        }
        if ((param0 ^ -1) > -1) {
            param0 = 0;
        } else {
            if (var4 < param0) {
                param0 = var4;
            }
        }
        this.field_Ab = param0;
        this.field_Gb = param2;
        if (param1 != 31401) {
            discarded$0 = this.b(-50, 68);
        }
    }

    private final int b(int param0, int param1) {
        int incrementValue$2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var3 = 0;
        var4 = param1;
        var5 = this.field_Eb.length();
        L0: while (true) {
          L1: {
            if (param0 <= var4) {
              break L1;
            } else {
              if (var3 >= var5) {
                break L1;
              } else {
                incrementValue$2 = var3;
                var3++;
                var4 = var4 + this.field_Fb.field_eb.a(this.field_Eb.charAt(incrementValue$2));
                continue L0;
              }
            }
          }
          return var3;
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (!param4) {
            this.field_wb = 87L;
        }
        this.a(param1, -119, param0, param3, param2);
        this.field_Fb.a(0, -84, param0, 0, param2);
        this.field_Cb.a(0, 123, param0, 0, param2);
        this.field_Hb = -4 + param2;
    }

    private final void n(int param0) {
        if (null == this.field_Db) {
            return;
        }
        this.field_Ib = this.field_Db.c(param0 + -10964);
        if (param0 != 11090) {
            this.field_Bb = true;
        }
    }

    kw(long param0, llb param1, llb param2, llb param3) {
        this(param0, param1, param2, param3, -1);
    }

    final int j(int param0) {
        if (param0 != 0) {
            this.field_Ab = -109;
        }
        return this.field_Ab;
    }

    final void a(int param0, eab param1) {
        try {
            if (param0 != -20640) {
                this.b(false);
            }
            this.field_Db = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kw.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(byte param0) {
        if (param0 < 38) {
            return;
        }
        if (!(this.field_Db != null)) {
            return;
        }
        this.h(31960);
        this.b(true);
    }

    final void f(byte param0) {
        try {
            int dupTemp$1 = 0;
            int var2 = 0;
            long var3_long = 0L;
            int var3 = 0;
            Exception var4 = null;
            int var4_int = 0;
            int var5 = 0;
            int var6 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object stackIn_12_0 = null;
            Object stackIn_13_0 = null;
            Object stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            int stackIn_32_0 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_11_0 = null;
            Object stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            Object stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            int stackOut_31_0 = 0;
            int stackOut_30_0 = 0;
            L0: {
              var6 = VoidHunters.field_G;
              var2 = this.b(-this.field_Fb.field_t + (-this.field_M + kc.field_b), param0 + 6);
              if (1 == this.field_o) {
                L1: {
                  this.a(var2, 3047);
                  this.field_Bb = true;
                  var3_long = wt.a(false);
                  stackOut_11_0 = this;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (-251L >= (var3_long + -this.field_wb ^ -1L)) {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L1;
                  } else {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    break L1;
                  }
                }
                L2: {
                  ((kw) (this)).field_zb = stackIn_14_1 != 0;
                  if (this.field_zb) {
                    L3: {
                      this.field_Gb = this.k(-1);
                      this.field_Ab = this.m(-10001);
                      if ((this.field_Ab ^ -1) >= -1) {
                        break L3;
                      } else {
                        if (32 == this.field_Eb.charAt(this.field_Ab + -1)) {
                          this.field_Ab = this.field_Ab - 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_vb = this.field_Ab;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_wb = var3_long;
                break L0;
              } else {
                L4: {
                  if ((hu.field_b ^ -1) != -2) {
                    break L4;
                  } else {
                    if (this.field_Bb) {
                      L5: {
                        if (!this.field_zb) {
                          break L5;
                        } else {
                          if (var2 >= this.field_vb) {
                            break L5;
                          } else {
                            if (this.field_Gb < var2) {
                              var2 = this.field_vb;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      this.field_Ab = var2;
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_Bb = false;
                break L0;
              }
            }
            L6: {
              if (!this.field_pb) {
                dupTemp$1 = this.field_Eb.length();
                this.field_Gb = dupTemp$1;
                this.field_Ab = dupTemp$1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              this.field_Cb.field_L = this.field_Fb.field_eb.b(this.field_Eb.toString().substring(0, this.field_Ab));
              if (param0 == -6) {
                break L7;
              } else {
                this.field_zb = true;
                break L7;
              }
            }
            L8: {
              if (this.field_Gb != this.field_Ab) {
                L9: {
                  var3 = this.field_Fb.field_L + this.field_Fb.field_eb.b(this.field_Eb.toString().substring(0, this.field_Gb));
                  if (this.field_Cb.field_L <= var3) {
                    stackOut_31_0 = this.field_Cb.field_L;
                    stackIn_32_0 = stackOut_31_0;
                    break L9;
                  } else {
                    stackOut_30_0 = var3;
                    stackIn_32_0 = stackOut_30_0;
                    break L9;
                  }
                }
                var4_int = stackIn_32_0;
                var5 = Math.abs(-this.field_Cb.field_L + var3);
                this.field_Kb.a(this.field_Fb.field_t + var4_int, 116, var5, 2, this.field_Hb);
                break L8;
              } else {
                this.field_Kb.a(this.field_Cb.field_L, -30, 0, 2, this.field_Hb);
                break L8;
              }
            }
            L10: {
              if (this.field_Ib == null) {
                break L10;
              } else {
                if (this.field_Ib.field_f == 0) {
                  break L10;
                } else {
                  var7 = (java.awt.datatransfer.Transferable) (this.field_Ib.field_d);
                  try {
                    L11: {
                      var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                      this.b(true);
                      this.a(var8, false);
                      break L11;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L12;
                    }
                  }
                  this.field_Ib = null;
                  break L10;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, boolean param1) {
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        String discarded$15 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if ((this.field_yb ^ -1) == 0) {
                break L1;
              } else {
                var3_int = this.field_yb + -this.field_Eb.length();
                if (var3_int != 0) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (this.field_Ab != this.field_Eb.length()) {
                var4 = this.field_Eb.toString().substring(this.field_Ab, this.field_Eb.length());
                discarded$11 = npa.a(this.field_Ab, false, this.field_Eb, ' ');
                discarded$12 = this.field_Eb.append(param0);
                discarded$13 = this.field_Eb.append(var4);
                break L2;
              } else {
                discarded$14 = this.field_Eb.append(param0);
                break L2;
              }
            }
            L3: {
              this.field_Fb.field_R = this.field_Eb.toString();
              this.field_Ab = this.field_Eb.length();
              if (!param1) {
                break L3;
              } else {
                discarded$15 = this.i(-87);
                break L3;
              }
            }
            this.field_Gb = this.field_Ab;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("kw.FA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        StringBuilder discarded$5 = npa.a(0, !param0 ? true : false, this.field_Eb, ' ');
        if (!param0) {
            this.a(97, -10, -98);
        }
        this.field_Ab = 0;
        this.field_Gb = 0;
        this.field_Fb.field_R = this.field_Eb.toString();
    }

    private final void a(int param0, int param1) {
        this.field_Ab = param0;
        if (!si.field_o[81]) {
            this.field_Gb = this.field_Ab;
        }
        if (param1 != 3047) {
            kw.g((byte) -20);
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if ((this.field_Ab ^ -1) != param0) {
          var2 = this.field_Ab + -1;
          L0: while (true) {
            L1: {
              if (-1 <= (var2 ^ -1)) {
                break L1;
              } else {
                if (deb.a(-126, this.field_Eb.charAt(var2 - 1))) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        } else {
          return this.field_Ab;
        }
    }

    final boolean a(int param0, int param1, char param2) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var4 = 0;
        String var5 = null;
        int stackIn_22_0 = 0;
        int stackIn_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        if (param2 == 60) {
          return false;
        } else {
          if (62 != param2) {
            L0: {
              if (param1 == -1) {
                break L0;
              } else {
                this.field_Kb = (llb) null;
                break L0;
              }
            }
            L1: {
              if (param2 < 32) {
                break L1;
              } else {
                if (param2 <= 126) {
                  L2: {
                    if (this.field_Ab != this.field_Gb) {
                      this.b(true);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (0 == (this.field_yb ^ -1)) {
                        break L4;
                      } else {
                        if (this.field_Eb.length() < this.field_yb) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (this.field_Ab == this.field_Eb.length()) {
                        discarded$4 = this.field_Eb.append(param2);
                        break L5;
                      } else {
                        var5 = this.field_Eb.toString().substring(this.field_Ab, this.field_Eb.length());
                        discarded$5 = npa.a(this.field_Ab, false, this.field_Eb, ' ');
                        discarded$6 = this.field_Eb.append(param2);
                        discarded$7 = this.field_Eb.append(var5);
                        break L5;
                      }
                    }
                    this.field_Fb.field_R = this.field_Eb.toString();
                    this.field_Ab = this.field_Ab + 1;
                    this.field_Gb = this.field_Ab;
                    break L3;
                  }
                  return true;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (85 != param0) {
                if (param0 == 101) {
                  if (this.field_Ab == this.field_Gb) {
                    if (this.field_Ab >= this.field_Eb.length()) {
                      break L6;
                    } else {
                      this.field_Gb = 1 + this.field_Ab;
                      this.b(true);
                      return true;
                    }
                  } else {
                    this.b(true);
                    return true;
                  }
                } else {
                  if (13 != param0) {
                    if (96 != param0) {
                      if (-98 == (param0 ^ -1)) {
                        if (this.field_Ab >= this.field_Eb.length()) {
                          break L6;
                        } else {
                          L7: {
                            if (si.field_o[82]) {
                              stackOut_40_0 = this.m(-10001);
                              stackIn_41_0 = stackOut_40_0;
                              break L7;
                            } else {
                              stackOut_39_0 = 1 + this.field_Ab;
                              stackIn_41_0 = stackOut_39_0;
                              break L7;
                            }
                          }
                          var4 = stackIn_41_0;
                          this.a(var4, param1 + 3048);
                          return true;
                        }
                      } else {
                        if (-103 == (param0 ^ -1)) {
                          this.a(0, 3047);
                          return true;
                        } else {
                          if (param0 == 103) {
                            this.a(this.field_Eb.length(), 3047);
                            return true;
                          } else {
                            L8: {
                              if (!si.field_o[82]) {
                                break L8;
                              } else {
                                if (param0 != 65) {
                                  break L8;
                                } else {
                                  this.e((byte) 116);
                                  return true;
                                }
                              }
                            }
                            L9: {
                              if (!si.field_o[82]) {
                                break L9;
                              } else {
                                if (param0 != 66) {
                                  break L9;
                                } else {
                                  this.h(param1 + 31961);
                                  return true;
                                }
                              }
                            }
                            if (!si.field_o[82]) {
                              break L6;
                            } else {
                              if (67 != param0) {
                                break L6;
                              } else {
                                this.n(11090);
                                return true;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (-1 <= (this.field_Ab ^ -1)) {
                        break L6;
                      } else {
                        L10: {
                          if (!si.field_o[82]) {
                            stackOut_21_0 = this.field_Ab + -1;
                            stackIn_22_0 = stackOut_21_0;
                            break L10;
                          } else {
                            stackOut_20_0 = this.k(param1 + 0);
                            stackIn_22_0 = stackOut_20_0;
                            break L10;
                          }
                        }
                        var4 = stackIn_22_0;
                        this.a(var4, 3047);
                        return true;
                      }
                    }
                  } else {
                    this.a(true);
                    return true;
                  }
                }
              } else {
                if (this.field_Ab == this.field_Gb) {
                  if ((this.field_Ab ^ -1) >= -1) {
                    break L6;
                  } else {
                    this.field_Gb = -1 + this.field_Ab;
                    this.b(true);
                    return true;
                  }
                } else {
                  this.b(true);
                  return true;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    private final String i(int param0) {
        int discarded$0 = 0;
        if (param0 > -46) {
            discarded$0 = this.j(-108);
        }
        String var2 = this.field_Eb.toString();
        int var3 = this.field_Ab > this.field_Gb ? this.field_Gb : this.field_Ab;
        int var4 = this.field_Ab > this.field_Gb ? this.field_Ab : this.field_Gb;
        return var2.substring(var3, var4);
    }

    private kw(long param0, llb param1, llb param2, llb param3, int param4) {
        super(param0, param1);
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_2_1 = null;
        StringBuilder stackIn_2_2 = null;
        Object stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        StringBuilder stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        StringBuilder stackOut_1_1 = null;
        StringBuilder stackOut_1_2 = null;
        Object stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        StringBuilder stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        Object stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        StringBuilder stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        this.field_Bb = false;
        this.field_wb = 0L;
        this.field_vb = -1;
        this.field_zb = false;
        try {
          L0: {
            L1: {
              this.field_yb = param4;
              this.field_Kb = new llb(0L, param2);
              this.field_Fb = new llb(0L, param3);
              this.field_Cb = new llb(0L, param3);
              this.field_T = true;
              stackOut_1_0 = this;
              stackOut_1_1 = null;
              stackOut_1_2 = null;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (this.field_yb == -1) {
                stackOut_3_0 = this;
                stackOut_3_1 = null;
                stackOut_3_2 = null;
                stackOut_3_3 = 256;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = null;
                stackOut_2_2 = null;
                stackOut_2_3 = this.field_yb;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                break L1;
              }
            }
            ((kw) (this)).field_Eb = new StringBuilder(stackIn_4_3);
            this.field_Fb.field_R = this.field_Eb.toString();
            this.field_Cb.field_s = "|";
            this.field_Cb.field_R = "";
            this.field_lb = new ij();
            this.b(-561, this.field_Kb);
            this.b(-561, this.field_Fb);
            this.b(-561, this.field_Cb);
            this.field_pb = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var7);
            stackOut_6_1 = new StringBuilder().append("kw.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final String l(int param0) {
        if (param0 != -14453) {
            return (String) null;
        }
        return this.field_Eb.toString();
    }

    private final void h(int param0) {
        if (!(null != this.field_Db)) {
            return;
        }
        if (param0 != 31960) {
            return;
        }
        String var2 = this.i(-51);
        if (!(var2.length() != 0)) {
            return;
        }
        java.awt.datatransfer.StringSelection var3 = new java.awt.datatransfer.StringSelection(this.i(-100));
        mob discarded$0 = this.field_Db.a((byte) -45, (java.awt.datatransfer.Transferable) ((Object) var3));
    }

    private final int m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 == -10001) {
            break L0;
          } else {
            this.a((byte) 4, 75);
            break L0;
          }
        }
        var2 = this.field_Eb.length();
        if (var2 == this.field_Ab) {
          return this.field_Ab;
        } else {
          var3 = 1 + this.field_Ab;
          L1: while (true) {
            L2: {
              if (var3 >= var2) {
                break L2;
              } else {
                if (deb.a(-113, this.field_Eb.charAt(var3 + -1))) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        if (!(this.field_Gb == this.field_Ab)) {
            var2 = this.field_Gb >= this.field_Ab ? this.field_Ab : this.field_Gb;
            var3 = this.field_Ab <= this.field_Gb ? this.field_Gb : this.field_Ab;
            this.field_Ab = var2;
            this.field_Gb = var2;
            var4 = this.field_Eb.toString().substring(var3, this.field_Eb.length());
            discarded$0 = npa.a(var2, !param0 ? true : false, this.field_Eb, ' ');
            discarded$1 = this.field_Eb.append(var4);
            this.field_Fb.field_R = this.field_Eb.toString();
        }
        if (!param0) {
            this.field_vb = -102;
        }
    }

    static {
        field_Jb = "Shortcut Reference";
        field_xb = new gj();
    }
}
