/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sl extends fe {
    private int field_O;
    static byte[] field_Y;
    private int field_Z;
    private long field_T;
    private long field_X;
    static int[] field_V;
    private int field_R;
    static int[] field_P;
    private int field_N;
    private boolean field_S;
    private boolean field_Q;
    static String field_W;
    static String field_U;

    private final void j(byte param0) {
        if (!(!(this.field_t instanceof pe))) {
            ((pe) ((Object) this.field_t)).a((sl) (this), false);
        }
        if (param0 != 3) {
            this.field_N = 98;
        }
    }

    final static String a(boolean param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        if (0L >= param1) {
            return null;
        }
        if (param1 >= 6582952005840035281L) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (-1L != (var4 ^ -1L)) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = dp.field_d[(int)(var7 + -(param1 * 37L))];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        if (param0) {
            field_U = (String) null;
        }
        return var6.toString();
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_18_0 = 0;
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
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (this.field_z instanceof io) {
                L1: {
                  var8_int = ((io) ((Object) this.field_z)).a(param5, wn.field_i, gg.field_f, (ei) (this), 105, param1);
                  stackIn_6_0 = this;

                  stackIn_6_1 = 86;

                  if (0 != (var8_int ^ -1)) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = var8_int;
                    break L1;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = 0;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, stackIn_7_2);
                  var8_long = rl.a((byte) -107);
                  stackIn_9_0 = this;

                  if (-251L >= (var8_long - this.field_X ^ -1L)) {
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
                  ((sl) (this)).field_Q = stackIn_10_1 != 0;
                  if (this.field_Q) {
                    L4: {
                      this.field_N = this.j(32);
                      this.field_R = this.h(27);
                      if ((this.field_R ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (-33 == (this.field_m.charAt(this.field_R - 1) ^ -1)) {
                          this.field_R = this.field_R - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_Z = this.field_R;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_X = var8_long;
                stackIn_18_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackIn_20_0 = 0;
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
            stackIn_23_0 = (RuntimeException) (var8);

            stackIn_23_1 = new StringBuilder().append("sl.AA(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -14642) {
            ei var4 = (ei) null;
            this.a('ﾣ', -96, true, (ei) null);
        }
        if (!(this.field_N == this.field_R)) {
            var2 = this.field_N < this.field_R ? this.field_N : this.field_R;
            var3 = this.field_N >= this.field_R ? this.field_N : this.field_R;
            this.field_N = var2;
            this.field_R = var2;
            this.field_m = this.field_m.substring(0, var2) + this.field_m.substring(var3, this.field_m.length());
            this.i(117);
        }
    }

    private final int h(int param0) {
        int discarded$1 = 0;
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = Pool.field_O;
          if (param0 > 15) {
            break L0;
          } else {
            discarded$1 = this.h(-3);
            break L0;
          }
        }
        var2 = this.field_m.length();
        if (this.field_R == var2) {
          return this.field_R;
        } else {
          var3 = 1 + this.field_R;
          L1: while (true) {
            L2: {
              if (var3 >= var2) {
                break L2;
              } else {
                if (this.field_m.charAt(-1 + var3) == 32) {
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

    private final void a(int param0, int param1) {
        this.field_R = param1;
        if (!(vj.field_c[81])) {
            this.field_N = this.field_R;
        }
        int var3 = -72 / ((param0 - -33) / 62);
    }

    void a(ei param0, int param1, int param2, int param3) {
        io var7 = null;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, param3);
            this.k(-20923);
            if (this.field_n == 1) {
                if (!(!(this.field_z instanceof io))) {
                    var7 = (io) ((Object) this.field_z);
                    var6 = var7.a(param3, wn.field_i, gg.field_f, (ei) (this), param1 + -882, param2);
                    if (-1 != var6) {
                        if (this.field_Q && var6 < this.field_Z) {
                            if (!(var6 <= this.field_N)) {
                                var6 = this.field_Z;
                            }
                        }
                        this.field_R = var6;
                    }
                }
                this.field_T = rl.a((byte) -126);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "sl.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(int param0) {
        if (param0 < 55) {
            this.field_Z = -85;
        }
        this.field_R = 0;
        this.field_N = 0;
        this.field_m = "";
        this.i(-44);
    }

    final void a(byte param0, boolean param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            this.field_m = param2;
            if (param0 == -124) {
              L2: {
                var4_int = param2.length();
                if (-1 == this.field_O) {
                  break L2;
                } else {
                  if (var4_int > this.field_O) {
                    this.field_m = this.field_m.substring(0, this.field_O);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                dupTemp$1 = this.field_m.length();
                this.field_N = dupTemp$1;
                this.field_R = dupTemp$1;
                if (param1) {
                  break L3;
                } else {
                  this.i(param0 + 211);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("sl.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (-1 == this.field_O) {
                break L1;
              } else {
                var3_int = this.field_O + -this.field_m.length();
                if (-1 < (var3_int ^ -1)) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (this.field_R != this.field_m.length()) {
                this.field_m = this.field_m.substring(0, this.field_R) + param1 + this.field_m.substring(this.field_R, this.field_m.length());
                break L2;
              } else {
                this.field_m = this.field_m + param1;
                break L2;
              }
            }
            L3: {
              this.field_R = this.field_R + param1.length();
              if (param0 > 21) {
                break L3;
              } else {
                this.a(-32, -52);
                break L3;
              }
            }
            this.field_N = this.field_R;
            this.i(118);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("sl.J(").append(param0).append(',');

            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void i(byte param0) {
        field_Y = null;
        field_V = null;
        field_U = null;
        field_W = null;
        if (param0 != 23) {
            return;
        }
        field_P = null;
    }

    private final void g(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            if (param0 == 4) {
              try {
                L0: {
                  var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                  this.g(-14642);
                  this.a(param0 + 106, var2);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  break L1;
                }
              }
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

    private final void k(int param0) {
        op var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        io var9;
        var8 = Pool.field_O;
        if (!this.field_S) {
          this.field_r = 0;
          this.field_v = 0;
          return;
        } else {
          if (!(this.field_z instanceof io)) {
            return;
          } else {
            var9 = (io) ((Object) this.field_z);
            var3 = var9.b(0, (ei) (this));
            var4 = var3.a(-1);
            var5 = var9.a((byte) 26, (ei) (this));
            var6 = var9.a(-10492) >> 1352383521;
            if (-var6 + var5 <= var4) {
              L0: {
                var7 = this.field_v + var3.a(this.field_R, (byte) -88);
                if (-var6 + var5 >= var7) {
                  if (var7 < var6) {
                    this.field_v = this.field_v - var7 - -var6;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  this.field_v = -var7 + (-var6 + (var5 + this.field_v));
                  break L0;
                }
              }
              if (param0 == -20923) {
                L1: {
                  if (0 >= this.field_v) {
                    if (-var5 + var6 > this.field_v) {
                      this.field_v = -var5 - -var6;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    this.field_v = 0;
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              this.field_v = 0;
              this.field_r = 0;
              return;
            }
          }
        }
    }

    sl(String param0, cc param1, int param2) {
        super(param0, param1);
        this.field_Z = -1;
        this.field_Q = false;
        this.field_X = 0L;
        try {
            this.field_O = param2;
            this.field_z = db.field_Sb.field_j;
            this.a((byte) -124, true, param0);
            this.field_S = true;
            this.field_T = rl.a((byte) -101);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "sl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0) {
        String var2 = this.h((byte) 63);
        if (param0) {
            this.field_O = 71;
        }
        if (0 < var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h((byte) 63))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        int dupTemp$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
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
              this.field_T = rl.a((byte) -116);
              if (!param2) {
                break L1;
              } else {
                this.field_T = 25L;
                break L1;
              }
            }
            L2: {
              if (param0 == 60) {
                break L2;
              } else {
                if (param0 == 62) {
                  break L2;
                } else {
                  L3: {
                    if (param0 < 32) {
                      break L3;
                    } else {
                      if (param0 > 126) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_R == this.field_N) {
                            break L4;
                          } else {
                            this.g(-14642);
                            break L4;
                          }
                        }
                        L5: {
                          if (this.field_O == -1) {
                            break L5;
                          } else {
                            if (this.field_m.length() < this.field_O) {
                              break L5;
                            } else {
                              return true;
                            }
                          }
                        }
                        L6: {
                          if (this.field_R >= this.field_m.length()) {
                            this.field_m = this.field_m + param0;
                            dupTemp$0 = this.field_m.length();
                            this.field_R = dupTemp$0;
                            this.field_N = dupTemp$0;
                            break L6;
                          } else {
                            this.field_m = this.field_m.substring(0, this.field_R) + param0 + this.field_m.substring(this.field_R, this.field_m.length());
                            this.field_R = this.field_R + 1;
                            this.field_N = this.field_R;
                            break L6;
                          }
                        }
                        this.i(-27);
                        stackIn_18_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L7: {
                    if (85 != param1) {
                      if ((param1 ^ -1) == -102) {
                        if (this.field_R == this.field_N) {
                          if (this.field_R < this.field_m.length()) {
                            this.field_N = 1 + this.field_R;
                            this.g(-14642);
                            stackIn_74_0 = 1;
                            decompiledRegionSelector0 = 14;
                            break L0;
                          } else {
                            break L7;
                          }
                        } else {
                          this.g(-14642);
                          stackIn_70_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        }
                      } else {
                        if (param1 != 13) {
                          if ((param1 ^ -1) != -97) {
                            if (-98 != (param1 ^ -1)) {
                              if (102 != param1) {
                                if (-104 != (param1 ^ -1)) {
                                  if (84 != param1) {
                                    L8: {
                                      if (!vj.field_c[82]) {
                                        break L8;
                                      } else {
                                        if (65 == param1) {
                                          this.l(-98);
                                          stackIn_67_0 = 1;
                                          decompiledRegionSelector0 = 12;
                                          break L0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!vj.field_c[82]) {
                                        break L9;
                                      } else {
                                        if (66 != param1) {
                                          break L9;
                                        } else {
                                          this.a(param2);
                                          stackIn_61_0 = 1;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!vj.field_c[82]) {
                                      break L7;
                                    } else {
                                      if (-68 != (param1 ^ -1)) {
                                        break L7;
                                      } else {
                                        this.g((byte) 4);
                                        stackIn_65_0 = 1;
                                        decompiledRegionSelector0 = 11;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.j((byte) 3);
                                    stackIn_54_0 = 1;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  }
                                } else {
                                  this.a(76, this.field_m.length());
                                  stackIn_51_0 = 1;
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                }
                              } else {
                                this.a(-113, 0);
                                stackIn_48_0 = 1;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              }
                            } else {
                              if (this.field_R < this.field_m.length()) {
                                L10: {
                                  stackIn_43_0 = this;

                                  stackIn_43_1 = -128;

                                  if (!vj.field_c[82]) {
                                    stackIn_44_0 = this;
                                    stackIn_44_1 = stackIn_43_1;
                                    stackIn_44_2 = this.field_R + 1;
                                    break L10;
                                  } else {
                                    stackIn_44_0 = this;
                                    stackIn_44_1 = stackIn_43_1;
                                    stackIn_44_2 = this.h(31);
                                    break L10;
                                  }
                                }
                                this.a(stackIn_44_1, stackIn_44_2);
                                stackIn_45_0 = 1;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            if (this.field_R > 0) {
                              L11: {
                                stackIn_35_0 = this;

                                stackIn_35_1 = 97;

                                if (vj.field_c[82]) {
                                  stackIn_36_0 = this;
                                  stackIn_36_1 = stackIn_35_1;
                                  stackIn_36_2 = this.j(32);
                                  break L11;
                                } else {
                                  stackIn_36_0 = this;
                                  stackIn_36_1 = stackIn_35_1;
                                  stackIn_36_2 = this.field_R - 1;
                                  break L11;
                                }
                              }
                              this.a(stackIn_36_1, stackIn_36_2);
                              stackIn_37_0 = 1;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          this.f(57);
                          stackIn_29_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      if (this.field_N != this.field_R) {
                        this.g(-14642);
                        stackIn_25_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if ((this.field_R ^ -1) >= -1) {
                          break L7;
                        } else {
                          this.field_N = -1 + this.field_R;
                          this.g(-14642);
                          stackIn_23_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
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
          L12: {
            var5 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var5);

            stackIn_79_1 = new StringBuilder().append("sl.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L12;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L12;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_37_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_45_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_48_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_51_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_54_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_61_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_65_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_67_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_70_0 != 0;
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

    private final void l(int param0) {
        this.a(false);
        int var2 = -115 % ((-16 - param0) / 63);
        this.g(-14642);
    }

    private final int j(int param0) {
        int var2;
        int var3;
        var3 = Pool.field_O;
        if (0 != this.field_R) {
          L0: {
            if (param0 == 32) {
              break L0;
            } else {
              this.field_T = -5L;
              break L0;
            }
          }
          var2 = -1 + this.field_R;
          L1: while (true) {
            L2: {
              if (-1 <= (var2 ^ -1)) {
                break L2;
              } else {
                if (32 == this.field_m.charAt(var2 + -1)) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        } else {
          return this.field_R;
        }
    }

    private final String h(byte param0) {
        if (param0 != 63) {
            sl.a(true, -93L);
        }
        int var2 = this.field_N >= this.field_R ? this.field_R : this.field_N;
        int var3 = this.field_R <= this.field_N ? this.field_N : this.field_R;
        return this.field_m.substring(var2, var3);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        io var6 = null;
        long var7 = 0L;
        int var5 = 60 % ((-42 - param1) / 53);
        if (null != this.field_z && -1 == (param0 ^ -1)) {
            this.field_z.a(this.field_I, param2, (byte) 77, param3, (ei) (this));
            if (this.field_z instanceof io) {
                var6 = (io) ((Object) this.field_z);
                if (this.field_N != this.field_R) {
                    var6.a(this.field_R, this.field_N, param2, param3, 154888568, (ei) (this));
                }
                var7 = rl.a((byte) -126);
                if (!(500L <= (-this.field_T + var7) % 1000L)) {
                    var6.a(1, param3, this.field_R, param2, (ei) (this));
                }
            }
        }
    }

    void i(int param0) {
        if (this.field_t instanceof pe) {
            ((pe) ((Object) this.field_t)).a((sl) (this), -79);
        }
        int var2 = -31 % ((param0 - 28) / 49);
    }

    static {
        field_Y = new byte[]{(byte)2, (byte)3, (byte)4, (byte)5};
        field_P = new int[8192];
        field_U = "Basics";
        field_W = "You and <%0> are out of lives!";
    }
}
