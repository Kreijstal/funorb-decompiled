/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ga extends wi {
    private boolean field_H;
    private long field_J;
    private int field_I;
    private int field_T;
    private int field_S;
    private boolean field_G;
    private long field_L;
    private int field_Q;
    static ut field_N;
    static boolean[] field_O;
    static ut field_E;
    static int field_P;
    static String field_M;
    static String field_U;
    static float field_R;
    static String field_K;

    private final void a(int param0, int param1) {
        this.field_I = param0;
        if (!(ne.field_G[81])) {
            this.field_Q = this.field_I;
        }
        if (param1 != 20) {
            field_E = (ut) null;
        }
    }

    final static String a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_E = (ut) null;
                break L1;
              }
            }
            L2: {
              var2_int = ki.a(bl.field_c, (byte) -105, tk.field_Ib);
              if (1 != var2_int) {
                break L2;
              } else {
                param1 = "<img=0>" + param1;
                break L2;
              }
            }
            L3: {
              if (-3 == (var2_int ^ -1)) {
                param1 = "<img=1>" + param1;
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_7_0 = (String) (param1);
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("ga.UA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    private final void m(int param0) {
        if (this.field_k instanceof sv) {
            ((sv) ((Object) this.field_k)).a(-86, (ga) (this));
        }
        if (param0 <= 66) {
            this.field_Q = 66;
        }
    }

    public static void l(int param0) {
        field_E = null;
        field_U = null;
        field_N = null;
        field_K = null;
        field_O = null;
        if (param0 != 0) {
            field_P = 82;
        }
        field_M = null;
    }

    private final String k(int param0) {
        if (param0 != 82) {
            return (String) null;
        }
        int var2 = this.field_Q < this.field_I ? this.field_Q : this.field_I;
        int var3 = this.field_I > this.field_Q ? this.field_I : this.field_Q;
        return this.field_q.substring(var2, var3);
    }

    private final void k(byte param0) {
        if (param0 < 99) {
            this.i((byte) 116);
        }
        String var2 = this.k(82);
        if (0 < var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(82))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(boolean param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            String var3 = null;
            Object stackIn_3_0 = null;
            String stackIn_3_1 = null;
            Object stackIn_4_0 = null;
            String stackIn_4_1 = null;
            Object stackIn_5_0 = null;
            String stackIn_5_1 = null;
            int stackIn_5_2 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_2_0 = null;
            String stackOut_2_1 = null;
            Object stackOut_4_0 = null;
            String stackOut_4_1 = null;
            int stackOut_4_2 = 0;
            Object stackOut_3_0 = null;
            String stackOut_3_1 = null;
            int stackOut_3_2 = 0;
            L0: {
              if (param0) {
                break L0;
              } else {
                var3 = (String) null;
                this.a((String) null, (byte) -122, true);
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  var2_ref = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                  this.i(-126);
                  stackOut_2_0 = this;
                  stackOut_2_1 = (String) (var2_ref);
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  if (param0) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = (String) ((Object) stackIn_4_1);
                    stackOut_4_2 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = (String) ((Object) stackIn_3_1);
                    stackOut_3_2 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    break L2;
                  }
                }
                this.a(stackIn_5_1, stackIn_5_2 != 0);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void m(byte param0) {
        if (param0 > -57) {
            this.m(49);
        }
        if (!(!(this.field_k instanceof sv))) {
            ((sv) ((Object) this.field_k)).a((byte) 113, (ga) (this));
        }
    }

    final void a(String param0, byte param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                param0 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_q = param0;
              var4_int = param0.length();
              if ((this.field_S ^ -1) == 0) {
                break L2;
              } else {
                if (this.field_S < var4_int) {
                  this.field_q = this.field_q.substring(0, this.field_S);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$2 = this.field_q.length();
              this.field_Q = dupTemp$2;
              this.field_I = dupTemp$2;
              if (param2) {
                break L3;
              } else {
                this.m((byte) -83);
                break L3;
              }
            }
            L4: {
              if (param1 == -17) {
                break L4;
              } else {
                this.field_S = 42;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("ga.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ke var8 = null;
        long var6 = 0L;
        if (null != this.field_r) {
            if (0 == param0) {
                this.field_r.a(127, this.field_y, param3, (fd) (this), param2);
                if (this.field_r instanceof ke) {
                    var8 = (ke) ((Object) this.field_r);
                    if (!(this.field_I == this.field_Q)) {
                        var8.a(param2, this.field_I, this.field_Q, (fd) (this), 91, param3);
                    }
                    var6 = nj.a(30);
                    if (-501L < ((var6 + -this.field_L) % 1000L ^ -1L)) {
                        var8.a(this.field_I, param2, param3, true, (fd) (this));
                    }
                }
            }
        }
        if (param1 != 65) {
            this.field_I = -80;
        }
    }

    private final void i(int param0) {
        ag discarded$0 = null;
        int var2 = 0;
        int var3 = 0;
        if (param0 >= -117) {
            vm var4 = (vm) null;
            discarded$0 = ga.a((vm) null, -85);
        }
        if (this.field_I != this.field_Q) {
            var2 = this.field_Q >= this.field_I ? this.field_I : this.field_Q;
            var3 = this.field_Q >= this.field_I ? this.field_Q : this.field_I;
            this.field_Q = var2;
            this.field_I = var2;
            this.field_q = this.field_q.substring(0, var2) + this.field_q.substring(var3, this.field_q.length());
            this.m((byte) -96);
        }
    }

    ga(String param0, jv param1, int param2) {
        super(param0, param1);
        this.field_J = 0L;
        this.field_T = -1;
        this.field_G = false;
        try {
            this.field_r = nb.field_i.field_h;
            this.field_S = param2;
            this.a(param0, (byte) -17, true);
            this.field_H = true;
            this.field_L = nj.a(-123);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void i(byte param0) {
        this.field_I = 0;
        this.field_q = "";
        if (param0 >= -11) {
            field_E = (ut) null;
        }
        this.field_Q = 0;
        this.m((byte) -85);
    }

    final static ag a(vm param0, int param1) {
        ag var2 = null;
        RuntimeException var2_ref = null;
        ag stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ag stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = new ag(param0, param0);
              ps.field_a.a(var2, 3);
              if (param1 > 108) {
                break L1;
              } else {
                field_U = (String) null;
                break L1;
              }
            }
            pi.field_b.a(param0);
            stackOut_2_0 = (ag) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("ga.TA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    void a(byte param0, fd param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        ke var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
              super.a(param0, param1, param2, param3);
              this.j((byte) 110);
              if ((this.field_p ^ -1) != -2) {
                break L1;
              } else {
                L2: {
                  if (!(this.field_r instanceof ke)) {
                    break L2;
                  } else {
                    var7 = (ke) ((Object) this.field_r);
                    var6 = var7.a(n.field_m, (fd) (this), el.field_A, param2, param3, 0);
                    if (0 == (var6 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_G) {
                          break L3;
                        } else {
                          if (var6 >= this.field_T) {
                            break L3;
                          } else {
                            if (this.field_Q < var6) {
                              var6 = this.field_T;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_I = var6;
                      break L2;
                    }
                  }
                }
                this.field_L = nj.a(param0 ^ -117);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("ga.P(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (!(this.field_r instanceof ke)) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var8_int = ((ke) ((Object) this.field_r)).a(n.field_m, (fd) (this), el.field_A, param5, param1, 0);
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var8_int == -1) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = var8_int;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, 20);
                  var8_long = nj.a(95);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (-251L >= (var8_long - this.field_J ^ -1L)) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                L3: {
                  ((ga) (this)).field_G = stackIn_9_1 != 0;
                  if (this.field_G) {
                    L4: {
                      this.field_Q = this.l((byte) -55);
                      this.field_I = this.h((byte) 104);
                      if ((this.field_I ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (this.field_q.charAt(this.field_I - 1) != 32) {
                          break L4;
                        } else {
                          this.field_I = this.field_I - 1;
                          break L4;
                        }
                      }
                    }
                    this.field_T = this.field_I;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_J = var8_long;
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
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
            stackOut_19_0 = (RuntimeException) (var8);
            stackOut_19_1 = new StringBuilder().append("ga.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_40_0 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_76_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -60) {
                break L1;
              } else {
                field_O = (boolean[]) null;
                break L1;
              }
            }
            this.field_L = nj.a(101);
            if (param0 == 60) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 62) {
                L2: {
                  if (32 > param0) {
                    break L2;
                  } else {
                    if (param0 <= 126) {
                      L3: {
                        if (this.field_Q == this.field_I) {
                          break L3;
                        } else {
                          this.i(-125);
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (0 == (this.field_S ^ -1)) {
                            break L5;
                          } else {
                            if (this.field_q.length() >= this.field_S) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (this.field_I < this.field_q.length()) {
                            this.field_q = this.field_q.substring(0, this.field_I) + param0 + this.field_q.substring(this.field_I, this.field_q.length());
                            this.field_I = this.field_I + 1;
                            this.field_Q = this.field_I;
                            break L6;
                          } else {
                            this.field_q = this.field_q + param0;
                            dupTemp$1 = this.field_q.length();
                            this.field_I = dupTemp$1;
                            this.field_Q = dupTemp$1;
                            break L6;
                          }
                        }
                        this.m((byte) -61);
                        break L4;
                      }
                      stackOut_74_0 = 1;
                      stackIn_75_0 = stackOut_74_0;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                L7: {
                  if ((param3 ^ -1) != -86) {
                    if (param3 != 101) {
                      if (param3 != 13) {
                        if (96 != param3) {
                          if (param3 != 97) {
                            if ((param3 ^ -1) != -103) {
                              if (-104 != (param3 ^ -1)) {
                                if (84 != param3) {
                                  L8: {
                                    if (!ne.field_G[82]) {
                                      break L8;
                                    } else {
                                      if (65 == param3) {
                                        this.j(-13630);
                                        stackOut_63_0 = 1;
                                        stackIn_64_0 = stackOut_63_0;
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!ne.field_G[82]) {
                                      break L9;
                                    } else {
                                      if (-67 == (param3 ^ -1)) {
                                        this.k((byte) 109);
                                        stackOut_61_0 = 1;
                                        stackIn_62_0 = stackOut_61_0;
                                        decompiledRegionSelector0 = 12;
                                        break L0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  if (!ne.field_G[82]) {
                                    break L7;
                                  } else {
                                    if (param3 != 67) {
                                      break L7;
                                    } else {
                                      this.a(true);
                                      stackOut_59_0 = 1;
                                      stackIn_60_0 = stackOut_59_0;
                                      decompiledRegionSelector0 = 11;
                                      break L0;
                                    }
                                  }
                                } else {
                                  this.m(99);
                                  stackOut_49_0 = 1;
                                  stackIn_50_0 = stackOut_49_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              } else {
                                this.a(this.field_q.length(), 20);
                                stackOut_46_0 = 1;
                                stackIn_47_0 = stackOut_46_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              this.a(0, 20);
                              stackOut_43_0 = 1;
                              stackIn_44_0 = stackOut_43_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            if (this.field_I >= this.field_q.length()) {
                              break L7;
                            } else {
                              L10: {
                                stackOut_37_0 = this;
                                stackIn_39_0 = stackOut_37_0;
                                stackIn_38_0 = stackOut_37_0;
                                if (ne.field_G[82]) {
                                  stackOut_39_0 = this;
                                  stackOut_39_1 = this.h((byte) 37);
                                  stackIn_40_0 = stackOut_39_0;
                                  stackIn_40_1 = stackOut_39_1;
                                  break L10;
                                } else {
                                  stackOut_38_0 = this;
                                  stackOut_38_1 = 1 + this.field_I;
                                  stackIn_40_0 = stackOut_38_0;
                                  stackIn_40_1 = stackOut_38_1;
                                  break L10;
                                }
                              }
                              this.a(stackIn_40_1, 20);
                              stackOut_40_0 = 1;
                              stackIn_41_0 = stackOut_40_0;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          }
                        } else {
                          if (this.field_I <= 0) {
                            break L7;
                          } else {
                            L11: {
                              stackOut_30_0 = this;
                              stackIn_32_0 = stackOut_30_0;
                              stackIn_31_0 = stackOut_30_0;
                              if (!ne.field_G[82]) {
                                stackOut_32_0 = this;
                                stackOut_32_1 = -1 + this.field_I;
                                stackIn_33_0 = stackOut_32_0;
                                stackIn_33_1 = stackOut_32_1;
                                break L11;
                              } else {
                                stackOut_31_0 = this;
                                stackOut_31_1 = this.l((byte) -55);
                                stackIn_33_0 = stackOut_31_0;
                                stackIn_33_1 = stackOut_31_1;
                                break L11;
                              }
                            }
                            this.a(stackIn_33_1, 20);
                            stackOut_33_0 = 1;
                            stackIn_34_0 = stackOut_33_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      } else {
                        this.i((byte) -107);
                        stackOut_26_0 = 1;
                        stackIn_27_0 = stackOut_26_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      if (this.field_I == this.field_Q) {
                        if (this.field_I < this.field_q.length()) {
                          this.field_Q = this.field_I + 1;
                          this.i(-126);
                          stackOut_23_0 = 1;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          break L7;
                        }
                      } else {
                        this.i(-127);
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    if (this.field_Q != this.field_I) {
                      this.i(-128);
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (0 >= this.field_I) {
                        break L7;
                      } else {
                        this.field_Q = -1 + this.field_I;
                        this.i(-123);
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_76_0 = 0;
                stackIn_77_0 = stackOut_76_0;
                decompiledRegionSelector0 = 15;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var5);
            stackOut_78_1 = new StringBuilder().append("ga.E(").append(param0).append(',').append(param1).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L12;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L12;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_27_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_34_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_41_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_44_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_47_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_50_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_60_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_62_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_64_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_75_0 != 0;
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

    private final int l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Kickabout.field_G;
        if (0 == this.field_I) {
          return this.field_I;
        } else {
          var2 = -1 + this.field_I;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (this.field_q.charAt(var2 + -1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            if (param0 == -55) {
              return var2;
            } else {
              return -81;
            }
          }
        }
    }

    private final void j(int param0) {
        if (param0 != -13630) {
            return;
        }
        this.k((byte) 119);
        this.i(-124);
    }

    private final int h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        var2 = this.field_q.length();
        if (this.field_I == var2) {
          return this.field_I;
        } else {
          if (param0 > 1) {
            var3 = this.field_I + 1;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (-33 == (this.field_q.charAt(-1 + var3) ^ -1)) {
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
            return -65;
          }
        }
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (0 != (this.field_S ^ -1)) {
                var3_int = this.field_S + -this.field_q.length();
                if ((var3_int ^ -1) <= -1) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_I == this.field_q.length()) {
                this.field_q = this.field_q + param0;
                break L2;
              } else {
                this.field_q = this.field_q.substring(0, this.field_I) + param0 + this.field_q.substring(this.field_I, this.field_q.length());
                break L2;
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                var4 = (String) null;
                this.a((String) null, (byte) -99, true);
                break L3;
              }
            }
            this.field_I = this.field_I + param0.length();
            this.field_Q = this.field_I;
            this.m((byte) -86);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ga.VA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void j(byte param0) {
        int var3 = 0;
        iq var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ke var10 = null;
        var9 = Kickabout.field_G;
        if (this.field_H) {
          if (!(this.field_r instanceof ke)) {
            return;
          } else {
            var10 = (ke) ((Object) this.field_r);
            var3 = 21 / ((param0 - 45) / 37);
            var4 = var10.a(5035, (fd) (this));
            var5 = var4.a((byte) -25);
            var6 = var10.a((byte) -124, (fd) (this));
            var7 = var10.a((byte) -76) >> -824223839;
            if (var5 >= var6 + -var7) {
              L0: {
                var8 = this.field_s + var4.b(0, this.field_I);
                if (-var7 + var6 >= var8) {
                  if (var8 >= var7) {
                    break L0;
                  } else {
                    this.field_s = var7 + (-var8 + this.field_s);
                    break L0;
                  }
                } else {
                  this.field_s = this.field_s + var6 - var7 + -var8;
                  break L0;
                }
              }
              L1: {
                if (this.field_s > 0) {
                  this.field_s = 0;
                  break L1;
                } else {
                  if (var7 + -var6 <= this.field_s) {
                    break L1;
                  } else {
                    this.field_s = var7 + -var6;
                    break L1;
                  }
                }
              }
              return;
            } else {
              this.field_s = 0;
              this.field_o = 0;
              return;
            }
          }
        } else {
          this.field_s = 0;
          this.field_o = 0;
          return;
        }
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            field_N = (ut) ((Object) new ot(140, 140));
            field_M = "No options available";
            field_P = field_N.field_o >> 1474897601;
            field_O = new boolean[89];
            field_U = "You can spectate this game";
            var0 = 0;
            L0: while (true) {
              if (field_O.length <= var0) {
                field_K = "Offline";
                break $cfr$clinit;
              } else {
                L1: {
                  if (var0 == 0) {
                    field_O[var0] = false;
                    break L1;
                  } else {
                    if (-2 == (var0 ^ -1)) {
                      field_O[var0] = false;
                      break L1;
                    } else {
                      if (var0 == 2) {
                        field_O[var0] = false;
                        break L1;
                      } else {
                        if ((var0 ^ -1) != -4) {
                          if (4 != var0) {
                            if (var0 != 5) {
                              if (-7 != (var0 ^ -1)) {
                                if ((var0 ^ -1) == -8) {
                                  field_O[var0] = true;
                                  break L1;
                                } else {
                                  if (var0 == 8) {
                                    field_O[var0] = true;
                                    break L1;
                                  } else {
                                    if ((var0 ^ -1) == -10) {
                                      field_O[var0] = true;
                                      break L1;
                                    } else {
                                      if (var0 == 10) {
                                        field_O[var0] = true;
                                        break L1;
                                      } else {
                                        if ((var0 ^ -1) == -12) {
                                          field_O[var0] = true;
                                          break L1;
                                        } else {
                                          if (12 == var0) {
                                            field_O[var0] = true;
                                            break L1;
                                          } else {
                                            if ((var0 ^ -1) != -14) {
                                              if (var0 != 14) {
                                                if (var0 != 15) {
                                                  if (-17 != (var0 ^ -1)) {
                                                    if (17 == var0) {
                                                      field_O[var0] = true;
                                                      break L1;
                                                    } else {
                                                      if ((var0 ^ -1) != -19) {
                                                        if (var0 == 19) {
                                                          field_O[var0] = true;
                                                          break L1;
                                                        } else {
                                                          if (var0 != 20) {
                                                            if (21 == var0) {
                                                              field_O[var0] = true;
                                                              break L1;
                                                            } else {
                                                              if (-23 == (var0 ^ -1)) {
                                                                field_O[var0] = true;
                                                                break L1;
                                                              } else {
                                                                if (var0 != 23) {
                                                                  if ((var0 ^ -1) == -25) {
                                                                    field_O[var0] = true;
                                                                    break L1;
                                                                  } else {
                                                                    if (25 != var0) {
                                                                      if (var0 != 26) {
                                                                        if (27 == var0) {
                                                                          field_O[var0] = true;
                                                                          break L1;
                                                                        } else {
                                                                          if (28 == var0) {
                                                                            field_O[var0] = true;
                                                                            break L1;
                                                                          } else {
                                                                            if (var0 != 29) {
                                                                              if ((var0 ^ -1) != -31) {
                                                                                if (31 != var0) {
                                                                                  if (-33 != (var0 ^ -1)) {
                                                                                    if (33 != var0) {
                                                                                      if (var0 != 34) {
                                                                                        if ((var0 ^ -1) != -36) {
                                                                                          if (-37 != (var0 ^ -1)) {
                                                                                            if (37 == var0) {
                                                                                              field_O[var0] = false;
                                                                                              break L1;
                                                                                            } else {
                                                                                              if (var0 != 38) {
                                                                                                if ((var0 ^ -1) != -40) {
                                                                                                  if ((var0 ^ -1) == -41) {
                                                                                                    field_O[var0] = false;
                                                                                                    break L1;
                                                                                                  } else {
                                                                                                    if (-42 == (var0 ^ -1)) {
                                                                                                      field_O[var0] = false;
                                                                                                      break L1;
                                                                                                    } else {
                                                                                                      if (-43 != (var0 ^ -1)) {
                                                                                                        if (43 == var0) {
                                                                                                          field_O[var0] = true;
                                                                                                          break L1;
                                                                                                        } else {
                                                                                                          if (44 != var0) {
                                                                                                            if ((var0 ^ -1) != -46) {
                                                                                                              if (-47 != (var0 ^ -1)) {
                                                                                                                if (var0 != 47) {
                                                                                                                  if (-49 == (var0 ^ -1)) {
                                                                                                                    field_O[var0] = false;
                                                                                                                    break L1;
                                                                                                                  } else {
                                                                                                                    if (-50 != (var0 ^ -1)) {
                                                                                                                      if ((var0 ^ -1) != -51) {
                                                                                                                        if (-52 == (var0 ^ -1)) {
                                                                                                                          field_O[var0] = false;
                                                                                                                          break L1;
                                                                                                                        } else {
                                                                                                                          if ((var0 ^ -1) == -53) {
                                                                                                                            field_O[var0] = false;
                                                                                                                            break L1;
                                                                                                                          } else {
                                                                                                                            if (53 != var0) {
                                                                                                                              if (-55 != (var0 ^ -1)) {
                                                                                                                                if (-56 != (var0 ^ -1)) {
                                                                                                                                  if ((var0 ^ -1) == -57) {
                                                                                                                                    field_O[var0] = false;
                                                                                                                                    break L1;
                                                                                                                                  } else {
                                                                                                                                    if (-58 != (var0 ^ -1)) {
                                                                                                                                      if ((var0 ^ -1) == -59) {
                                                                                                                                        field_O[var0] = false;
                                                                                                                                        break L1;
                                                                                                                                      } else {
                                                                                                                                        if ((var0 ^ -1) == -60) {
                                                                                                                                          field_O[var0] = false;
                                                                                                                                          break L1;
                                                                                                                                        } else {
                                                                                                                                          if ((var0 ^ -1) == -61) {
                                                                                                                                            field_O[var0] = false;
                                                                                                                                            break L1;
                                                                                                                                          } else {
                                                                                                                                            if (61 != var0) {
                                                                                                                                              if (var0 == 62) {
                                                                                                                                                field_O[var0] = false;
                                                                                                                                                break L1;
                                                                                                                                              } else {
                                                                                                                                                if (var0 != 63) {
                                                                                                                                                  if (var0 != 64) {
                                                                                                                                                    if (var0 == 65) {
                                                                                                                                                      field_O[var0] = false;
                                                                                                                                                      break L1;
                                                                                                                                                    } else {
                                                                                                                                                      if ((var0 ^ -1) == -67) {
                                                                                                                                                        field_O[var0] = false;
                                                                                                                                                        break L1;
                                                                                                                                                      } else {
                                                                                                                                                        if (var0 != 67) {
                                                                                                                                                          if ((var0 ^ -1) == -69) {
                                                                                                                                                            field_O[var0] = false;
                                                                                                                                                            break L1;
                                                                                                                                                          } else {
                                                                                                                                                            if (69 != var0) {
                                                                                                                                                              if ((var0 ^ -1) != -71) {
                                                                                                                                                                if (var0 != 71) {
                                                                                                                                                                  if (var0 == 72) {
                                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                                    break L1;
                                                                                                                                                                  } else {
                                                                                                                                                                    if ((var0 ^ -1) == -74) {
                                                                                                                                                                      field_O[var0] = false;
                                                                                                                                                                      break L1;
                                                                                                                                                                    } else {
                                                                                                                                                                      if ((var0 ^ -1) != -75) {
                                                                                                                                                                        if (75 == var0) {
                                                                                                                                                                          field_O[var0] = false;
                                                                                                                                                                          break L1;
                                                                                                                                                                        } else {
                                                                                                                                                                          if (-77 == (var0 ^ -1)) {
                                                                                                                                                                            field_O[var0] = false;
                                                                                                                                                                            break L1;
                                                                                                                                                                          } else {
                                                                                                                                                                            if ((var0 ^ -1) != -78) {
                                                                                                                                                                              if (var0 == 78) {
                                                                                                                                                                                field_O[var0] = false;
                                                                                                                                                                                break L1;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (79 == var0) {
                                                                                                                                                                                  field_O[var0] = false;
                                                                                                                                                                                  break L1;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (80 != var0) {
                                                                                                                                                                                    if (-82 == (var0 ^ -1)) {
                                                                                                                                                                                      field_O[var0] = false;
                                                                                                                                                                                      break L1;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (-83 != (var0 ^ -1)) {
                                                                                                                                                                                        if (83 == var0) {
                                                                                                                                                                                          field_O[var0] = false;
                                                                                                                                                                                          break L1;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if (var0 == 84) {
                                                                                                                                                                                            field_O[var0] = false;
                                                                                                                                                                                            break L1;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            if (85 == var0) {
                                                                                                                                                                                              field_O[var0] = false;
                                                                                                                                                                                              break L1;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              if ((var0 ^ -1) != -87) {
                                                                                                                                                                                                if (var0 == 87) {
                                                                                                                                                                                                  field_O[var0] = false;
                                                                                                                                                                                                  break L1;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if (var0 != 88) {
                                                                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                                                                    break L1;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                                                                    break L1;
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                              } else {
                                                                                                                                                                                                field_O[var0] = false;
                                                                                                                                                                                                break L1;
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                      } else {
                                                                                                                                                                                        field_O[var0] = false;
                                                                                                                                                                                        break L1;
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  } else {
                                                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                                                    break L1;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            } else {
                                                                                                                                                                              field_O[var0] = false;
                                                                                                                                                                              break L1;
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      } else {
                                                                                                                                                                        field_O[var0] = false;
                                                                                                                                                                        break L1;
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                } else {
                                                                                                                                                                  field_O[var0] = false;
                                                                                                                                                                  break L1;
                                                                                                                                                                }
                                                                                                                                                              } else {
                                                                                                                                                                field_O[var0] = false;
                                                                                                                                                                break L1;
                                                                                                                                                              }
                                                                                                                                                            } else {
                                                                                                                                                              field_O[var0] = false;
                                                                                                                                                              break L1;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        } else {
                                                                                                                                                          field_O[var0] = false;
                                                                                                                                                          break L1;
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  } else {
                                                                                                                                                    field_O[var0] = false;
                                                                                                                                                    break L1;
                                                                                                                                                  }
                                                                                                                                                } else {
                                                                                                                                                  field_O[var0] = false;
                                                                                                                                                  break L1;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            } else {
                                                                                                                                              field_O[var0] = false;
                                                                                                                                              break L1;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      field_O[var0] = false;
                                                                                                                                      break L1;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  field_O[var0] = false;
                                                                                                                                  break L1;
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                field_O[var0] = false;
                                                                                                                                break L1;
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              field_O[var0] = false;
                                                                                                                              break L1;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        field_O[var0] = false;
                                                                                                                        break L1;
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      field_O[var0] = false;
                                                                                                                      break L1;
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  field_O[var0] = false;
                                                                                                                  break L1;
                                                                                                                }
                                                                                                              } else {
                                                                                                                field_O[var0] = false;
                                                                                                                break L1;
                                                                                                              }
                                                                                                            } else {
                                                                                                              field_O[var0] = false;
                                                                                                              break L1;
                                                                                                            }
                                                                                                          } else {
                                                                                                            field_O[var0] = false;
                                                                                                            break L1;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        field_O[var0] = false;
                                                                                                        break L1;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  field_O[var0] = false;
                                                                                                  break L1;
                                                                                                }
                                                                                              } else {
                                                                                                field_O[var0] = false;
                                                                                                break L1;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            field_O[var0] = false;
                                                                                            break L1;
                                                                                          }
                                                                                        } else {
                                                                                          field_O[var0] = false;
                                                                                          break L1;
                                                                                        }
                                                                                      } else {
                                                                                        field_O[var0] = false;
                                                                                        break L1;
                                                                                      }
                                                                                    } else {
                                                                                      field_O[var0] = false;
                                                                                      break L1;
                                                                                    }
                                                                                  } else {
                                                                                    field_O[var0] = true;
                                                                                    break L1;
                                                                                  }
                                                                                } else {
                                                                                  field_O[var0] = true;
                                                                                  break L1;
                                                                                }
                                                                              } else {
                                                                                field_O[var0] = true;
                                                                                break L1;
                                                                              }
                                                                            } else {
                                                                              field_O[var0] = true;
                                                                              break L1;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        field_O[var0] = true;
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      field_O[var0] = true;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                } else {
                                                                  field_O[var0] = true;
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            field_O[var0] = true;
                                                            break L1;
                                                          }
                                                        }
                                                      } else {
                                                        field_O[var0] = true;
                                                        break L1;
                                                      }
                                                    }
                                                  } else {
                                                    field_O[var0] = true;
                                                    break L1;
                                                  }
                                                } else {
                                                  field_O[var0] = true;
                                                  break L1;
                                                }
                                              } else {
                                                field_O[var0] = true;
                                                break L1;
                                              }
                                            } else {
                                              field_O[var0] = true;
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                field_O[var0] = true;
                                break L1;
                              }
                            } else {
                              field_O[var0] = true;
                              break L1;
                            }
                          } else {
                            field_O[var0] = true;
                            break L1;
                          }
                        } else {
                          field_O[var0] = true;
                          break L1;
                        }
                      }
                    }
                  }
                }
                var0++;
                continue L0;
              }
            }
        }
    }
}
