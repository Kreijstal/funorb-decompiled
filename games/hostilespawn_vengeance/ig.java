/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ig extends ph {
    private int field_P;
    private boolean field_G;
    static ej field_N;
    private int field_J;
    static String field_H;
    private int field_O;
    private long field_Q;
    static bd field_S;
    static bd field_R;
    static int field_L;
    private long field_M;
    private int field_K;
    private boolean field_I;

    private final void f(byte param0) {
        if (param0 < 47) {
            return;
        }
        this.l(-6200);
        this.b(true);
    }

    private final int j(int param0) {
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_J == 0) {
          return this.field_J;
        } else {
          L0: {
            if (param0 == 10747) {
              break L0;
            } else {
              this.k(-75);
              break L0;
            }
          }
          var2 = -1 + this.field_J;
          L1: while (true) {
            L2: {
              if (var2 <= 0) {
                break L2;
              } else {
                if (32 == this.field_n.charAt(var2 - 1)) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        if (-1 != this.field_P) {
            var3_int = this.field_P - this.field_n.length();
            if (!(-1 < (var3_int ^ -1))) {
                return;
            }
            param1 = param1.substring(0, var3_int);
        }
        if (param0 != 0) {
            return;
        }
        try {
            if (this.field_J == this.field_n.length()) {
                this.field_n = this.field_n + param1;
            } else {
                this.field_n = this.field_n.substring(0, this.field_J) + param1 + this.field_n.substring(this.field_J, this.field_n.length());
            }
            this.field_J = this.field_J + param1.length();
            this.field_K = this.field_J;
            this.e((byte) 125);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ig.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
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
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_n = param2;
              var4_int = param2.length();
              if ((this.field_P ^ -1) == 0) {
                break L2;
              } else {
                if (this.field_P < var4_int) {
                  this.field_n = this.field_n.substring(0, this.field_P);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$2 = this.field_n.length();
              this.field_K = dupTemp$2;
              this.field_J = dupTemp$2;
              if (param0 >= 18) {
                break L3;
              } else {
                this.field_I = true;
                break L3;
              }
            }
            L4: {
              if (!param1) {
                this.e((byte) 125);
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

            stackIn_15_1 = new StringBuilder().append("ig.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static String a(byte param0, CharSequence[] param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              if (-2 == (param3 ^ -1)) {
                var10 = param1[param2];
                var4 = var10;
                if (var4 != null) {
                  stackIn_10_0 = var10.toString();
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param2 + param3;
                var5 = 0;
                if (param0 == 28) {
                  var6_int = param2;
                  L1: while (true) {
                    if (var4_int <= var6_int) {
                      var6 = new StringBuilder(var5);
                      var7 = param2;
                      L2: while (true) {
                        if (var7 >= var4_int) {
                          stackIn_27_0 = var6.toString();
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L3: {
                            var8 = param1[var7];
                            if (var8 != null) {
                              discarded$3 = var6.append(var8);
                              break L3;
                            } else {
                              discarded$4 = var6.append("null");
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      L4: {
                        var7_ref_CharSequence = param1[var6_int];
                        if (var7_ref_CharSequence == null) {
                          var5 += 4;
                          break L4;
                        } else {
                          var5 = var5 + var7_ref_CharSequence.length();
                          break L4;
                        }
                      }
                      var6_int++;
                      continue L1;
                    }
                  }
                } else {
                  stackIn_13_0 = (String) null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("ig.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                return stackIn_27_0;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        mi var8 = null;
        long var6 = 0L;
        if (null != this.field_h && 0 == param3) {
            this.field_h.a(param0, param1, 15430, (ag) (this), this.field_D);
            if (!(!(this.field_h instanceof mi))) {
                var8 = (mi) ((Object) this.field_h);
                if (this.field_J != this.field_K) {
                    var8.a(param1, (byte) 41, this.field_K, (ag) (this), param0, this.field_J);
                }
                var6 = hn.a((byte) 80);
                if (!(-501L >= ((-this.field_M + var6) % 1000L ^ -1L))) {
                    var8.a(param0, (ag) (this), this.field_J, 0, param1);
                }
            }
        }
        if (param2 <= 42) {
            field_R = (bd) null;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
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
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_19_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.field_h instanceof mi) {
                L1: {
                  var8_int = ((mi) ((Object) this.field_h)).a(param1, j.field_c, param4 + -226, (ag) (this), param2, rb.field_m);
                  stackIn_5_0 = this;

                  if (var8_int == -1) {
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
                  this.a(stackIn_6_1, param4 ^ 12);
                  var8_long = hn.a((byte) 80);
                  stackIn_8_0 = this;

                  if (250L <= -this.field_Q + var8_long) {
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
                  ((ig) (this)).field_I = stackIn_9_1 != 0;
                  if (this.field_I) {
                    L4: {
                      this.field_K = this.j(10747);
                      this.field_J = this.a(true);
                      if (0 >= this.field_J) {
                        break L4;
                      } else {
                        if (this.field_n.charAt(this.field_J + -1) == 32) {
                          this.field_J = this.field_J - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_O = this.field_J;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_Q = var8_long;
                stackIn_17_0 = 1;
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
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("ig.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private final String g(byte param0) {
        int var2 = this.field_J <= this.field_K ? this.field_J : this.field_K;
        int var4 = 102 % ((-29 - param0) / 57);
        int var3 = this.field_J > this.field_K ? this.field_J : this.field_K;
        return this.field_n.substring(var2, var3);
    }

    private final void l(int param0) {
        if (param0 != -6200) {
            return;
        }
        String var2 = this.g((byte) 77);
        if (!(0 >= var2.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.g((byte) 93))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final static boolean c(boolean param0) {
        String var2;
        int stackIn_7_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            var2 = (String) null;
            ig.a(false, (java.net.URL) null, (String) null, 120, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (fa.field_c ^ -1)) {
              break L2;
            } else {
              if (md.field_k) {
                break L2;
              } else {
                if (kl.b(50)) {
                  break L2;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void k(int param0) {
        if (param0 != -1) {
            this.field_O = 45;
        }
        if (this.field_p instanceof cd) {
            ((cd) ((Object) this.field_p)).a((ig) (this), -97);
        }
    }

    private final void h(byte param0) {
        ce var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        mi var9;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_G) {
          if (!(this.field_h instanceof mi)) {
            return;
          } else {
            var9 = (mi) ((Object) this.field_h);
            if (param0 == -121) {
              var3 = var9.a((ag) (this), 1);
              var4 = var3.a(3915);
              var5 = var9.a((ag) (this), (byte) 15);
              var6 = var9.a(true) >> -1722921311;
              if (var4 >= -var6 + var5) {
                L0: {
                  var7 = this.field_q - -var3.b(this.field_J, 0);
                  if (-var6 + var5 >= var7) {
                    if (var6 <= var7) {
                      break L0;
                    } else {
                      this.field_q = -var7 - -var6 + this.field_q;
                      break L0;
                    }
                  } else {
                    this.field_q = -var7 - (-var5 - -var6 - this.field_q);
                    break L0;
                  }
                }
                L1: {
                  if (0 >= this.field_q) {
                    if (var6 + -var5 > this.field_q) {
                      this.field_q = var6 + -var5;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    this.field_q = 0;
                    break L1;
                  }
                }
                return;
              } else {
                this.field_q = 0;
                this.field_o = 0;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_q = 0;
          this.field_o = 0;
          return;
        }
    }

    final void o(int param0) {
        if (param0 > -121) {
            return;
        }
        this.field_J = 0;
        this.field_K = 0;
        this.field_n = "";
        this.e((byte) 125);
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(this.field_K == this.field_J)) {
            var2 = this.field_J > this.field_K ? this.field_K : this.field_J;
            var3 = this.field_J > this.field_K ? this.field_J : this.field_K;
            this.field_J = var2;
            this.field_K = var2;
            this.field_n = this.field_n.substring(0, var2) + this.field_n.substring(var3, this.field_n.length());
            this.e((byte) 125);
        }
        if (!param0) {
            ig.m(83);
        }
    }

    private final int a(boolean param0) {
        int var2;
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0) {
          var2 = this.field_n.length();
          if (var2 == this.field_J) {
            return this.field_J;
          } else {
            var3 = 1 + this.field_J;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (-33 == (this.field_n.charAt(var3 - 1) ^ -1)) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          }
        } else {
          return 83;
        }
    }

    private final void n(int param0) {
        try {
            String var2 = null;
            try {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.b(true);
                this.a(0, var2);
            } catch (Exception exception) {
            }
            if (param0 <= 90) {
                this.n(-125);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, int param1) {
        this.field_J = param0;
        if (param1 < 92) {
            this.field_G = false;
        }
        if (!(qh.field_m[81])) {
            this.field_K = this.field_J;
        }
    }

    void e(byte param0) {
        if (param0 != 125) {
            return;
        }
        if (this.field_p instanceof cd) {
            ((cd) ((Object) this.field_p)).a((ig) (this), (byte) -125);
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_N = null;
        field_H = null;
        field_S = null;
        if (param0 <= 5) {
            field_L = 78;
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_72_0 = 0;
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
              this.field_M = hn.a((byte) 80);
              if (param3 == 60) {
                break L1;
              } else {
                if (62 == param3) {
                  break L1;
                } else {
                  L2: {
                    if (param3 < 32) {
                      break L2;
                    } else {
                      if (param3 > 126) {
                        break L2;
                      } else {
                        L3: {
                          if (this.field_J == this.field_K) {
                            break L3;
                          } else {
                            this.b(true);
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if (0 == (this.field_P ^ -1)) {
                              break L5;
                            } else {
                              if (this.field_n.length() >= this.field_P) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (this.field_J >= this.field_n.length()) {
                              this.field_n = this.field_n + param3;
                              dupTemp$0 = this.field_n.length();
                              this.field_J = dupTemp$0;
                              this.field_K = dupTemp$0;
                              break L6;
                            } else {
                              this.field_n = this.field_n.substring(0, this.field_J) + param3 + this.field_n.substring(this.field_J, this.field_n.length());
                              this.field_J = this.field_J + 1;
                              this.field_K = this.field_J;
                              break L6;
                            }
                          }
                          this.e((byte) 125);
                          break L4;
                        }
                        stackIn_17_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L7: {
                    if (-86 != (param2 ^ -1)) {
                      if (-102 != (param2 ^ -1)) {
                        if (13 != param2) {
                          if (-97 != (param2 ^ -1)) {
                            if (97 == param2) {
                              if (this.field_J >= this.field_n.length()) {
                                break L7;
                              } else {
                                L8: {
                                  stackIn_70_0 = this;

                                  if (!qh.field_m[82]) {
                                    stackIn_71_0 = this;
                                    stackIn_71_1 = this.field_J - -1;
                                    break L8;
                                  } else {
                                    stackIn_71_0 = this;
                                    stackIn_71_1 = this.a(true);
                                    break L8;
                                  }
                                }
                                this.a(stackIn_71_1, 124);
                                stackIn_72_0 = 1;
                                decompiledRegionSelector0 = 14;
                                break L0;
                              }
                            } else {
                              if (-103 != (param2 ^ -1)) {
                                if ((param2 ^ -1) == -104) {
                                  this.a(this.field_n.length(), 98);
                                  stackIn_66_0 = 1;
                                  decompiledRegionSelector0 = 13;
                                  break L0;
                                } else {
                                  if (-85 != (param2 ^ -1)) {
                                    L9: {
                                      if (!qh.field_m[82]) {
                                        break L9;
                                      } else {
                                        if (param2 != 65) {
                                          break L9;
                                        } else {
                                          this.f((byte) 93);
                                          stackIn_56_0 = 1;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!qh.field_m[82]) {
                                        break L10;
                                      } else {
                                        if (-67 != (param2 ^ -1)) {
                                          break L10;
                                        } else {
                                          this.l(-6200);
                                          stackIn_60_0 = 1;
                                          decompiledRegionSelector0 = 11;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!qh.field_m[82]) {
                                      break L7;
                                    } else {
                                      if (67 != param2) {
                                        break L7;
                                      } else {
                                        this.n(param0 + -158);
                                        stackIn_64_0 = 1;
                                        decompiledRegionSelector0 = 12;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.k(-1);
                                    stackIn_52_0 = 1;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  }
                                }
                              } else {
                                this.a(0, 115);
                                stackIn_48_0 = 1;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              }
                            }
                          } else {
                            if ((this.field_J ^ -1) < -1) {
                              L11: {
                                stackIn_42_0 = this;

                                if (!qh.field_m[82]) {
                                  stackIn_43_0 = this;
                                  stackIn_43_1 = this.field_J - 1;
                                  break L11;
                                } else {
                                  stackIn_43_0 = this;
                                  stackIn_43_1 = this.j(10747);
                                  break L11;
                                }
                              }
                              this.a(stackIn_43_1, 114);
                              stackIn_44_0 = 1;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          this.o(-122);
                          stackIn_36_0 = 1;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        if (this.field_K != this.field_J) {
                          this.b(true);
                          stackIn_33_0 = 1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (this.field_J < this.field_n.length()) {
                            this.field_K = this.field_J - -1;
                            this.b(true);
                            stackIn_31_0 = 1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      }
                    } else {
                      if (this.field_K == this.field_J) {
                        if (0 < this.field_J) {
                          this.field_K = -1 + this.field_J;
                          this.b(true);
                          stackIn_25_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L7;
                        }
                      } else {
                        this.b(true);
                        stackIn_21_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  if (param0 == 274) {
                    stackIn_76_0 = 0;
                    decompiledRegionSelector0 = 15;
                    break L0;
                  } else {
                    this.field_Q = 124L;
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
            stackIn_79_0 = (RuntimeException) (var5);

            stackIn_79_1 = new StringBuilder().append("ig.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_44_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_48_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_52_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_56_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_60_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_64_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_66_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_72_0 != 0;
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

    final static java.net.URL a(boolean param0, java.net.URL param1, String param2, int param3, String param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_39_0 = null;
            java.net.URL stackIn_41_0 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            String stackIn_45_2 = null;
            StringBuilder stackIn_47_1 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            StringBuilder stackIn_50_1 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                L1: {
                  var5 = param1.getFile();
                  if (param0) {
                    break L1;
                  } else {
                    field_S = (bd) null;
                    break L1;
                  }
                }
                var6 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var5.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (0 > var7_int) {
                          break L4;
                        } else {
                          if (-1 < (param3 ^ -1)) {
                            break L3;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L2;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (var7_int >= 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                        break L6;
                      } else {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if (0 > var7_int) {
                          break L6;
                        } else {
                          if (param2 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L2;
                          } else {
                            var6 = var7_int;
                            continue L2;
                          }
                        }
                      }
                    }
                    L7: {
                      L8: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L8;
                        } else {
                          if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (0 <= var7_int) {
                        if (param4 == null) {
                          break L3;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L2;
                        }
                      } else {
                        break L7;
                      }
                    }
                    L9: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if ((param3 ^ -1) >= -1) {
                        break L9;
                      } else {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param3));
                        break L9;
                      }
                    }
                    L10: {
                      if (param2 == null) {
                        break L10;
                      } else {
                        if ((param2.length() ^ -1) >= -1) {
                          break L10;
                        } else {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param2);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param4 == null) {
                        break L11;
                      } else {
                        if (0 >= param4.length()) {
                          break L11;
                        } else {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param4);
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var5.length() > var6) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                        break L12;
                      } else {
                        discarded$8 = var7.append('/');
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackIn_39_0 = new java.net.URL(param1, var7.toString());
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_41_0 = (java.net.URL) (param1);
                      return stackIn_41_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L2;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L14: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_44_0 = (RuntimeException) (var5_ref);

                stackIn_44_1 = new StringBuilder().append("ig.E(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackIn_45_2 = "null";
                  break L14;
                } else {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackIn_45_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');

                if (param2 == null) {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "null";
                  break L15;
                } else {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "{...}";
                  break L15;
                }
              }
              L16: {


                stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "null";
                  break L16;
                } else {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "{...}";
                  break L16;
                }
              }
              throw wg.a((Throwable) ((Object) stackIn_45_0), stackIn_51_2 + ')');
            }
            return stackIn_39_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        mi var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.h((byte) -121);
              if ((this.field_r ^ -1) == -2) {
                L2: {
                  if (!(this.field_h instanceof mi)) {
                    break L2;
                  } else {
                    var5 = (mi) ((Object) this.field_h);
                    var6 = var5.a(param3, j.field_c, -115, (ag) (this), param1, rb.field_m);
                    if (-1 != var6) {
                      L3: {
                        if (!this.field_I) {
                          break L3;
                        } else {
                          if (var6 >= this.field_O) {
                            break L3;
                          } else {
                            if (var6 <= this.field_K) {
                              break L3;
                            } else {
                              var6 = this.field_O;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_J = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_M = hn.a((byte) 80);
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
            stackIn_14_0 = (RuntimeException) (var5_ref);

            stackIn_14_1 = new StringBuilder().append("ig.W(");

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
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ig(String param0, mh param1, int param2) {
        super(param0, param1);
        this.field_Q = 0L;
        this.field_I = false;
        this.field_O = -1;
        try {
            this.field_h = gf.field_e.field_j;
            this.field_P = param2;
            this.a((byte) 57, true, param0);
            this.field_G = true;
            this.field_M = hn.a((byte) 80);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ig.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_H = "Unpacking graphics";
        field_L = 0;
    }
}
