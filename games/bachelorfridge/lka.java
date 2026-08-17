/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lka extends hf {
    private boolean field_D;
    private int field_I;
    private boolean field_L;
    static String[][] field_E;
    private long field_A;
    private int field_H;
    private int field_J;
    private long field_F;
    static int[] field_G;
    private int field_K;

    private final void h(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            try {
              L0: {
                var3 = 123 % ((param0 - 55) / 48);
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.i(-12);
                this.a(var2, (byte) -51);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int j(int param0) {
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        if (param0 != this.field_H) {
          var2 = -1 + this.field_H;
          L0: while (true) {
            if (var2 > 0) {
              if (this.field_w.charAt(var2 - 1) != 32) {
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
          return this.field_H;
        }
    }

    public static void g(byte param0) {
        if (param0 >= -122) {
            field_G = (int[]) null;
            field_E = (String[][]) null;
            field_G = null;
            return;
        }
        field_E = (String[][]) null;
        field_G = null;
    }

    final void j(byte param0) {
        int var2 = -106 / ((52 - param0) / 41);
        this.field_K = 0;
        this.field_w = "";
        this.field_H = 0;
        this.i((byte) -118);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param0 == -26) {
          var2 = this.field_w.length();
          if (var2 == this.field_H) {
            return this.field_H;
          } else {
            var3 = 1 + this.field_H;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (this.field_w.charAt(-1 + var3) ^ -1)) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
        } else {
          return 120;
        }
    }

    void i(byte param0) {
        if (param0 < -87) {
          if (this.field_k instanceof fca) {
            ((fca) ((Object) this.field_k)).a((lka) (this), (byte) 63);
            return;
          } else {
            return;
          }
        } else {
          field_G = (int[]) null;
          if (!(this.field_k instanceof fca)) {
            return;
          } else {
            ((fca) ((Object) this.field_k)).a((lka) (this), (byte) 63);
            return;
          }
        }
    }

    final static kv a(byte param0, kv param1) {
        RuntimeException var2 = null;
        kv stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 54) {
                break L1;
              } else {
                lka.g((byte) -47);
                break L1;
              }
            }
            param1.g(2);
            param1.f(65793);
            stackIn_3_0 = (kv) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("lka.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (0 == (this.field_I ^ -1)) {
                break L1;
              } else {
                var3_int = this.field_I - this.field_w.length();
                if (-1 >= (var3_int ^ -1)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == -51) {
                break L2;
              } else {
                this.i(122);
                break L2;
              }
            }
            L3: {
              if (this.field_H != this.field_w.length()) {
                this.field_w = this.field_w.substring(0, this.field_H) + param0 + this.field_w.substring(this.field_H, this.field_w.length());
                break L3;
              } else {
                this.field_w = this.field_w + param0;
                break L3;
              }
            }
            this.field_H = this.field_H + param0.length();
            this.field_K = this.field_H;
            this.i((byte) -104);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("lka.G(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void g(int param0) {
        if (param0 != 81) {
          field_G = (int[]) null;
          this.b(false);
          this.i(115);
          return;
        } else {
          this.b(false);
          this.i(115);
          return;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
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
            if (!super.b(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_18_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.field_f instanceof qka) {
                L1: {
                  var8_int = ((qka) ((Object) this.field_f)).a((wj) (this), gd.field_m, param2, param4, mk.field_p, (byte) -86);
                  stackIn_5_0 = this;

                  stackIn_5_1 = 1;

                  if (-1 != var8_int) {
                    stackIn_6_0 = this;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = var8_int;
                    break L1;
                  } else {
                    stackIn_6_0 = this;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 0;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1 != 0, stackIn_6_2);
                  var8_long = f.b((byte) 73);
                  stackIn_8_0 = this;

                  if (-251L >= (var8_long - this.field_A ^ -1L)) {
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
                  ((lka) (this)).field_L = stackIn_9_1 != 0;
                  if (!this.field_L) {
                    break L3;
                  } else {
                    L4: {
                      this.field_K = this.j(0);
                      this.field_H = this.e((byte) -26);
                      if (this.field_H <= 0) {
                        break L4;
                      } else {
                        if (this.field_w.charAt(this.field_H + -1) == 32) {
                          this.field_H = this.field_H - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_J = this.field_H;
                    break L3;
                  }
                }
                this.field_A = var8_long;
                stackIn_16_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8);

            stackIn_21_1 = new StringBuilder().append("lka.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    private final void a(boolean param0, int param1) {
        if (!param0) {
            return;
        }
        this.field_H = param1;
        if (!(wga.field_q[81])) {
            this.field_K = this.field_H;
        }
    }

    private final void h(byte param0) {
        L0: {
          if (this.field_k instanceof fca) {
            ((fca) ((Object) this.field_k)).a((lka) (this), 0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 18) {
          field_E = (String[][]) null;
          return;
        } else {
          return;
        }
    }

    lka(String param0, pl param1, int param2) {
        super(param0, param1);
        this.field_L = false;
        this.field_A = 0L;
        this.field_J = -1;
        try {
            this.field_f = fda.field_i.field_s;
            this.field_I = param2;
            this.a((byte) -26, param0, true);
            this.field_D = true;
            this.field_F = f.b((byte) 73);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final String f(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        int var3;
        if (param0 != -53) {
          L0: {
            this.field_H = -11;
            if (this.field_H <= this.field_K) {
              stackIn_11_0 = this.field_H;
              break L0;
            } else {
              stackIn_11_0 = this.field_K;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (this.field_H <= this.field_K) {
              stackIn_14_0 = this.field_K;
              break L1;
            } else {
              stackIn_14_0 = this.field_H;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          return this.field_w.substring(var2, var3);
        } else {
          L2: {
            if (this.field_H <= this.field_K) {
              stackIn_4_0 = this.field_H;
              break L2;
            } else {
              stackIn_4_0 = this.field_K;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (this.field_H <= this.field_K) {
              stackIn_7_0 = this.field_K;
              break L3;
            } else {
              stackIn_7_0 = this.field_H;
              break L3;
            }
          }
          var3 = stackIn_7_0;
          return this.field_w.substring(var2, var3);
        }
    }

    private final void d(byte param0) {
        vv var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        qka var10;
        vv var11;
        qka var12;
        vv var13;
        var8 = BachelorFridge.field_y;
        if (this.field_D) {
          if (param0 < -71) {
            if (this.field_f instanceof qka) {
              var12 = (qka) ((Object) this.field_f);
              var13 = var12.b((wj) (this), false);
              var4 = var13.b((byte) 124);
              var5 = var12.a((wj) (this), false);
              var6 = var12.a(-30983) >> -1925269055;
              if (-var6 + var5 <= var4) {
                var7 = this.field_m - -var13.a(this.field_H, (byte) -99);
                if (var7 <= var5 + -var6) {
                  if (var6 <= var7) {
                    if (0 < this.field_m) {
                      this.field_m = 0;
                      return;
                    } else {
                      if (this.field_m >= -var5 - -var6) {
                        return;
                      } else {
                        this.field_m = var6 + -var5;
                        return;
                      }
                    }
                  } else {
                    this.field_m = this.field_m + (var6 + -var7);
                    if (0 < this.field_m) {
                      this.field_m = 0;
                      return;
                    } else {
                      if (this.field_m >= -var5 - -var6) {
                        return;
                      } else {
                        this.field_m = var6 + -var5;
                        return;
                      }
                    }
                  }
                } else {
                  this.field_m = -var7 + (var5 + -var6 + this.field_m);
                  if (0 < this.field_m) {
                    this.field_m = 0;
                    return;
                  } else {
                    if (this.field_m >= -var5 - -var6) {
                      return;
                    } else {
                      this.field_m = var6 + -var5;
                      return;
                    }
                  }
                }
              } else {
                this.field_o = 0;
                this.field_m = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_J = -15;
            if (this.field_f instanceof qka) {
              var10 = (qka) ((Object) this.field_f);
              var11 = var10.b((wj) (this), false);
              var3 = var11;
              var4 = var11.b((byte) 124);
              var5 = var10.a((wj) (this), false);
              var6 = var10.a(-30983) >> -1925269055;
              if (-var6 + var5 <= var4) {
                var7 = this.field_m - -var11.a(this.field_H, (byte) -99);
                if (var7 <= var5 + -var6) {
                  if (var6 > var7) {
                    this.field_m = this.field_m + (var6 + -var7);
                    if (0 >= this.field_m) {
                      if (this.field_m < -var5 - -var6) {
                        this.field_m = var6 + -var5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_m = 0;
                      return;
                    }
                  } else {
                    if (0 >= this.field_m) {
                      if (this.field_m < -var5 - -var6) {
                        this.field_m = var6 + -var5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_m = 0;
                      return;
                    }
                  }
                } else {
                  this.field_m = -var7 + (var5 + -var6 + this.field_m);
                  if (0 >= this.field_m) {
                    if (this.field_m >= -var5 - -var6) {
                      return;
                    } else {
                      this.field_m = var6 + -var5;
                      return;
                    }
                  } else {
                    this.field_m = 0;
                    return;
                  }
                }
              } else {
                this.field_o = 0;
                this.field_m = 0;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_m = 0;
          this.field_o = 0;
          return;
        }
    }

    void a(int param0, int param1, wj param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        qka var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.a(param0, param1, param2, param3 + 0);
            this.d((byte) -75);
            if (param3 == 20) {
              if (-2 == (this.field_u ^ -1)) {
                L1: {
                  if (this.field_f instanceof qka) {
                    var7 = (qka) ((Object) this.field_f);
                    var6 = var7.a((wj) (this), gd.field_m, param0, param1, mk.field_p, (byte) -85);
                    if (-1 == var6) {
                      break L1;
                    } else {
                      L2: {
                        if (!this.field_L) {
                          break L2;
                        } else {
                          if (this.field_J <= var6) {
                            break L2;
                          } else {
                            if (this.field_K >= var6) {
                              break L2;
                            } else {
                              var6 = this.field_J;
                              break L2;
                            }
                          }
                        }
                      }
                      this.field_H = var6;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                this.field_F = f.b((byte) 73);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
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
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("lka.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
            L2: {
              var4_int = -101 / ((param0 - 58) / 54);
              this.field_w = param1;
              var5 = param1.length();
              if ((this.field_I ^ -1) == 0) {
                break L2;
              } else {
                if (this.field_I < var5) {
                  this.field_w = this.field_w.substring(0, this.field_I);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            dupTemp$1 = this.field_w.length();
            this.field_K = dupTemp$1;
            this.field_H = dupTemp$1;
            if (!param2) {
              this.i((byte) -90);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("lka.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0) {
        try {
            String var2;
            var2 = this.f((byte) -53);
            if (param0) {
              return;
            } else {
              L0: {
                if ((var2.length() ^ -1) < -1) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.f((byte) -53))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_29_0 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        wj var6 = null;
        try {
          L0: {
            L1: {
              this.field_F = f.b((byte) 73);
              if (param2 == 60) {
                break L1;
              } else {
                if (62 == param2) {
                  break L1;
                } else {
                  L2: {
                    if (32 > param2) {
                      break L2;
                    } else {
                      if (param2 > 126) {
                        break L2;
                      } else {
                        L3: {
                          if (this.field_H == this.field_K) {
                            break L3;
                          } else {
                            this.i(param0 ^ -49);
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if (-1 == this.field_I) {
                              break L5;
                            } else {
                              if (this.field_w.length() >= this.field_I) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (this.field_H < this.field_w.length()) {
                              this.field_w = this.field_w.substring(0, this.field_H) + param2 + this.field_w.substring(this.field_H, this.field_w.length());
                              this.field_H = this.field_H + 1;
                              this.field_K = this.field_H;
                              break L6;
                            } else {
                              this.field_w = this.field_w + param2;
                              dupTemp$0 = this.field_w.length();
                              this.field_H = dupTemp$0;
                              this.field_K = dupTemp$0;
                              break L6;
                            }
                          }
                          this.i((byte) -123);
                          break L4;
                        }
                        stackIn_17_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L7: {
                    if (-86 == (param1 ^ -1)) {
                      if (this.field_H != this.field_K) {
                        this.i(120);
                        stackIn_73_0 = 1;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        if (-1 > (this.field_H ^ -1)) {
                          this.field_K = this.field_H - 1;
                          this.i(111);
                          stackIn_71_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          break L7;
                        }
                      }
                    } else {
                      if (-102 == (param1 ^ -1)) {
                        if (this.field_H != this.field_K) {
                          this.i(param0 + 109);
                          stackIn_66_0 = 1;
                          decompiledRegionSelector0 = 12;
                          break L0;
                        } else {
                          if (this.field_H < this.field_w.length()) {
                            this.field_K = 1 + this.field_H;
                            this.i(106);
                            stackIn_64_0 = 1;
                            decompiledRegionSelector0 = 11;
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        if (-14 != (param1 ^ -1)) {
                          if (-97 != (param1 ^ -1)) {
                            if (97 != param1) {
                              if (-103 != (param1 ^ -1)) {
                                if (103 != param1) {
                                  if (84 != param1) {
                                    L8: {
                                      if (!wga.field_q[82]) {
                                        break L8;
                                      } else {
                                        if (-66 != (param1 ^ -1)) {
                                          break L8;
                                        } else {
                                          this.g(81);
                                          stackIn_49_0 = 1;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!wga.field_q[82]) {
                                        break L9;
                                      } else {
                                        if ((param1 ^ -1) == -67) {
                                          this.b(false);
                                          stackIn_59_0 = 1;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if (!wga.field_q[82]) {
                                      break L7;
                                    } else {
                                      if (param1 == 67) {
                                        this.h(104);
                                        stackIn_57_0 = 1;
                                        decompiledRegionSelector0 = 9;
                                        break L0;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  } else {
                                    this.h((byte) 52);
                                    stackIn_45_0 = 1;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  }
                                } else {
                                  this.a(true, this.field_w.length());
                                  stackIn_42_0 = 1;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                }
                              } else {
                                this.a(true, 0);
                                stackIn_39_0 = 1;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            } else {
                              if (this.field_H >= this.field_w.length()) {
                                break L7;
                              } else {
                                L10: {
                                  stackIn_34_0 = this;

                                  stackIn_34_1 = 1;

                                  if (!wga.field_q[82]) {
                                    stackIn_35_0 = this;
                                    stackIn_35_1 = stackIn_34_1;
                                    stackIn_35_2 = 1 + this.field_H;
                                    break L10;
                                  } else {
                                    stackIn_35_0 = this;
                                    stackIn_35_1 = stackIn_34_1;
                                    stackIn_35_2 = this.e((byte) -26);
                                    break L10;
                                  }
                                }
                                this.a(stackIn_35_1 != 0, stackIn_35_2);
                                stackIn_36_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          } else {
                            if ((this.field_H ^ -1) >= -1) {
                              break L7;
                            } else {
                              L11: {
                                stackIn_27_0 = this;

                                stackIn_27_1 = 1;

                                if (wga.field_q[82]) {
                                  stackIn_28_0 = this;
                                  stackIn_28_1 = stackIn_27_1;
                                  stackIn_28_2 = this.j(0);
                                  break L11;
                                } else {
                                  stackIn_28_0 = this;
                                  stackIn_28_1 = stackIn_27_1;
                                  stackIn_28_2 = -1 + this.field_H;
                                  break L11;
                                }
                              }
                              this.a(stackIn_28_1 != 0, stackIn_28_2);
                              stackIn_29_0 = 1;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        } else {
                          this.j((byte) -85);
                          stackIn_22_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  if (param0 == 10) {
                    stackIn_77_0 = 0;
                    decompiledRegionSelector0 = 15;
                    break L0;
                  } else {
                    var6 = (wj) null;
                    this.b(-24, 51, -40, -52, -18, (wj) null, -94);
                    return false;
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
          L12: {
            var5 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var5);

            stackIn_80_1 = new StringBuilder().append("lka.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L12;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L12;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_39_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_42_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_45_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_49_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_57_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_59_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_64_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_66_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_71_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_73_0 != 0;
                                    } else {
                                      return stackIn_77_0 != 0;
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

    private final void i(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -97 / ((43 - param0) / 38);
        if (!(this.field_H == this.field_K)) {
            var3 = this.field_H <= this.field_K ? this.field_H : this.field_K;
            var4 = this.field_K < this.field_H ? this.field_H : this.field_K;
            this.field_H = var3;
            this.field_K = var3;
            this.field_w = this.field_w.substring(0, var3) + this.field_w.substring(var4, this.field_w.length());
            this.i((byte) -106);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        long var6;
        qka var8;
        if (null != this.field_f) {
          if (param2 == 0) {
            this.field_f.a(param3, (wj) (this), 32679, param1, this.field_z);
            if (this.field_f instanceof qka) {
              var8 = (qka) ((Object) this.field_f);
              if (this.field_K == this.field_H) {
                var6 = f.b((byte) 73);
                if ((-this.field_F + var6) % 1000L < 500L) {
                  var8.a((byte) -88, param1, (wj) (this), this.field_H, param3);
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                } else {
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                }
              } else {
                var8.a(this.field_K, -17394, param3, this.field_H, param1, (wj) (this));
                var6 = f.b((byte) 73);
                if ((-this.field_F + var6) % 1000L < 500L) {
                  var8.a((byte) -88, param1, (wj) (this), this.field_H, param3);
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                } else {
                  var5 = -91 / ((-20 - param0) / 54);
                  return;
                }
              }
            } else {
              var5 = -91 / ((-20 - param0) / 54);
              return;
            }
          } else {
            var5 = -91 / ((-20 - param0) / 54);
            return;
          }
        } else {
          var5 = -91 / ((-20 - param0) / 54);
          return;
        }
    }

    static {
    }
}
