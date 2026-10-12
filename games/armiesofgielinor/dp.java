/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends ClientUiComponent {
    private hd field_Tb;
    private ClientUiComponent field_Ob;
    private int field_Kb;
    static int[][] field_Vb;
    private boolean field_Nb;
    private int field_Mb;
    private int field_Jb;
    static long field_Lb;
    private boolean field_Ib;
    private long field_Wb;
    ClientUiComponent field_Pb;
    private int field_Ub;
    private StringBuilder field_Rb;
    private wo field_Sb;
    private ClientUiComponent field_Xb;
    private int field_Qb;

    private final int c(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 48) {
            this.field_Qb = -37;
          }
          var3_int = 0;
          var4 = 0;
          var5 = this.field_Rb.length();
          while (param1 > var4) {
            if (var5 > var3_int) {
              incrementValue$1 = var3_int;
              var3_int++;
              var4 = var4 + this.field_Pb.font.a(this.field_Rb.charAt(incrementValue$1));
              continue;
            }
            break;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "dp.U(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        try {
          PortalLossCondition.a(' ', 0, this.field_Rb, param0);
          this.field_Qb = 0;
          this.field_Jb = 0;
          this.field_Pb.text = this.field_Rb.toString();
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.A(" + param0 + ')');
        }
    }

    final void a(hd param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_Tb = param0;
          if (param1 != 176) {
            dp.n(63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("dp.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void n(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5 = MoveAttackRequest.field_K;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref), "dp.O(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        try {
          if (param0 != -123) {
            dp.f((byte) -111);
          }
          field_Vb = (int[][]) null;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.R(" + param0 + ')');
        }
    }

    private dp(long param0, ClientUiComponent param1, ClientUiComponent param2, ClientUiComponent param3, int param4) {
        super(param0, param1);
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0;
        StringBuilder stackIn_4_1;
        StringBuilder stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_Mb = -1;
        this.field_Nb = false;
        this.field_Ib = false;
        this.field_Wb = 0L;
        try {
          this.field_Ub = param4;
          this.field_Xb = new ClientUiComponent(0L, param2);
          this.field_Pb = new ClientUiComponent(0L, param3);
          this.field_Ob = new ClientUiComponent(0L, param3);
          this.field_M = true;
          stackIn_3_1 = null;
          stackIn_3_2 = null;
          if (this.field_Ub == -1) {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = 256;
          } else {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = this.field_Ub;
          }
          this.field_Rb = new StringBuilder(stackIn_4_3);
          this.field_Pb.text = this.field_Rb.toString();
          this.field_Ob.text = "";
          this.field_Ob.field_I = "|";
          this.children = new NodeDeque();
          this.addChild(this.field_Xb, 48);
          this.addChild(this.field_Pb, 48);
          this.addChild(this.field_Ob, 89);
          this.field_Y = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("dp.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_0 = stackIn_9_0;
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_14_0 = stackIn_13_0;
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = stackIn_9_0;
            stackIn_14_2 = "{...}";
          }
          stackIn_17_0 = stackIn_14_0;
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = stackIn_14_0;
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = this.field_Rb.length();
          if (0 > param1) {
            param1 = 0;
          } else {
            if (param1 > var4_int) {
              param1 = var4_int;
            }
          }
          if (0 > param2) {
            param2 = 0;
          } else {
            if (param2 > var4_int) {
              param2 = var4_int;
            }
          }
          if (param0 != -98) {
            discarded$1 = this.k(-15);
          }
          this.field_Qb = param2;
          this.field_Jb = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void l(int param0) {
        StringBuilder discarded$0 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        try {
          if (this.field_Qb != this.field_Jb) {
            if (this.field_Qb <= this.field_Jb) {
              stackIn_5_0 = this.field_Qb;
            } else {
              stackIn_5_0 = this.field_Jb;
            }
            var2_int = stackIn_5_0;
            if (this.field_Jb >= this.field_Qb) {
              stackIn_9_0 = this.field_Jb;
            } else {
              stackIn_9_0 = this.field_Qb;
            }
            var3 = stackIn_9_0;
            this.field_Jb = var2_int;
            this.field_Qb = var2_int;
            var4 = this.field_Rb.toString().substring(var3, this.field_Rb.length());
            PortalLossCondition.a(' ', var2_int, this.field_Rb, true);
            discarded$0 = this.field_Rb.append(var4);
            this.field_Pb.text = this.field_Rb.toString();
          }
          if (param0 == 32) {
            return;
          }
          field_Lb = -1L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.M(" + param0 + ')');
        }
    }

    private final void a(byte param0, String param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var3_intLifetime1;
        try {
          if (this.field_Ub != -1) {
            var3_int = this.field_Ub - this.field_Rb.length();
            if (0 == var3_int) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_Qb == this.field_Rb.length()) {
            discarded$0 = this.field_Rb.append(param1);
          } else {
            var4 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
            PortalLossCondition.a(' ', this.field_Qb, this.field_Rb, true);
            discarded$1 = this.field_Rb.append(param1);
            discarded$2 = this.field_Rb.append(var4);
          }
          var3_intLifetime1 = 109 / ((param0 - 44) / 40);
          this.field_Pb.text = this.field_Rb.toString();
          this.field_Qb = this.field_Rb.length();
          this.field_Jb = this.field_Qb;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("dp.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final String d(byte param0) {
        String var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        String stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        try {
          if (param0 != 115) {
            this.p(78);
          }
          var2 = this.field_Rb.toString();
          if (this.field_Qb <= this.field_Jb) {
            stackIn_6_0 = this.field_Qb;
          } else {
            stackIn_6_0 = this.field_Jb;
          }
          var3 = stackIn_6_0;
          if (this.field_Jb >= this.field_Qb) {
            stackIn_10_0 = this.field_Jb;
          } else {
            stackIn_10_0 = this.field_Qb;
          }
          var4 = stackIn_10_0;
          stackIn_11_0 = var2.substring(var3, var4);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "dp.D(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_57_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        try {
          if (param2 == 60) {
            return false;
          }
          if (62 == param2) {
            return false;
          }
          if (param2 >= 32 &&
            param2 <= 126) {
            if (this.field_Qb != this.field_Jb) {
              this.l(32);
            }
            if (-1 == this.field_Ub ||
              !(this.field_Rb.length() >= this.field_Ub)) {
              if (this.field_Qb != this.field_Rb.length()) {
                var5 = this.field_Rb.toString().substring(this.field_Qb, this.field_Rb.length());
                PortalLossCondition.a(' ', this.field_Qb, this.field_Rb, true);
                discarded$0 = this.field_Rb.append(param2);
                discarded$1 = this.field_Rb.append(var5);
              } else {
                discarded$2 = this.field_Rb.append(param2);
              }
              this.field_Pb.text = this.field_Rb.toString();
              this.field_Qb = this.field_Qb + 1;
              this.field_Jb = this.field_Qb;
            }
            return true;
          }
          if (param0 != 85) {
            if (param0 != 101) {
              if (param0 == 13) {
                this.a(true);
                return true;
              }
              if (param0 == 96) {
                if (this.field_Qb > 0) {
                  if (!br.field_f[82]) {
                    stackIn_66_0 = -1 + this.field_Qb;
                  } else {
                    stackIn_66_0 = this.k(-1);
                  }
                  var4_int = stackIn_66_0;
                  this.b(var4_int, false);
                  return true;
                }
              } else {
                if (param0 == 97) {
                  if (this.field_Qb < this.field_Rb.length()) {
                    if (!br.field_f[82]) {
                      stackIn_57_0 = this.field_Qb + 1;
                    } else {
                      stackIn_57_0 = this.e((byte) 109);
                    }
                    var4_int = stackIn_57_0;
                    this.b(var4_int, false);
                    return true;
                  }
                } else {
                  if (param0 == 102) {
                    this.b(0, false);
                    return true;
                  }
                  if (param0 == 103) {
                    this.b(this.field_Rb.length(), false);
                    return true;
                  }
                  if (br.field_f[82] &&
                    param0 == 65) {
                    this.h((byte) 114);
                    return true;
                  }
                  if (br.field_f[82] &&
                    param0 == 66) {
                    this.p(param1 ^ 26164);
                    return true;
                  }
                  if (br.field_f[82] &&
                    param0 == 67) {
                    this.g((byte) -77);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_Jb != this.field_Qb) {
                this.l(32);
                return true;
              }
              if (this.field_Qb < this.field_Rb.length()) {
                this.field_Jb = 1 + this.field_Qb;
                this.l(32);
                return true;
              }
            }
          } else {
            if (this.field_Qb != this.field_Jb) {
              this.l(32);
              return true;
            }
            if (this.field_Qb > 0) {
              this.field_Jb = this.field_Qb - 1;
              this.l(32);
              return true;
            }
          }
          if (param1 != -26126) {
            this.field_Wb = -48L;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "dp.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void g(byte param0) {
        if (this.field_Tb == null) {
          return;
        }
        try {
          int var2_int = -66 / ((72 - param0) / 35);
          this.field_Sb = this.field_Tb.a(0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.N(" + param0 + ')');
        }
    }

    private final void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null == this.field_Tb) {
            return;
          }
          this.p(-87);
          if (param0 <= 90) {
            this.field_Xb = (ClientUiComponent) null;
            this.l(32);
          } else {
            this.l(32);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.G(" + param0 + ')');
        }
    }

    private final void p(int param0) {
        try {
          java.awt.datatransfer.StringSelection var4 = null;
          if (this.field_Tb == null) {
            return;
          }
          int var2_int = -53 / ((param0 - 11) / 49);
          String var3 = this.d((byte) 115);
          if (var3.length() == 0) {
            return;
          }
          try {
            var4 = new java.awt.datatransfer.StringSelection(this.d((byte) 115));
            this.field_Tb.a((java.awt.datatransfer.Transferable) ((Object) var4), -26522);
          } catch (RuntimeException runtimeException) {
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.H(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String q(int param0) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_Xb = (ClientUiComponent) null;
          }
          stackIn_3_0 = this.field_Rb.toString();
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.I(" + param0 + ')');
        }
    }

    final int o(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -34 / ((param0 - 21) / 39);
          stackIn_1_0 = this.field_Qb;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.S(" + param0 + ')');
        }
    }

    final void a(String param0, byte param1) {
        StringBuilder discarded$4 = null;
        int dupTemp$5 = 0;
        int discarded$6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_Rb.setLength(0);
          var3_int = param0.length();
          if (this.field_Ub != -1 &&
            this.field_Ub < var3_int) {
            var3_int = this.field_Ub;
          }
          discarded$4 = this.field_Rb.append(param0.substring(0, var3_int));
          dupTemp$5 = this.field_Rb.length();
          this.field_Jb = dupTemp$5;
          this.field_Qb = dupTemp$5;
          this.field_Pb.text = this.field_Rb.toString();
          if (param1 == 45) {
            return;
          }
          discarded$6 = this.e((byte) 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("dp.T(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        try {
          this.setBounds(param3, -20500, param2, param0, param4);
          this.field_Pb.setBounds(param3, -20500, param2, param1, 0);
          this.field_Ob.setBounds(param3, -20500, param2, 0, 0);
          this.field_Kb = -4 + param3;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        this.field_Qb = param0;
        if (param1) {
          return;
        }
        try {
          if (!br.field_f[81]) {
            this.field_Jb = this.field_Qb;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.C(" + param0 + ',' + param1 + ')');
        }
    }

    dp(long param0, ClientUiComponent param1, ClientUiComponent param2, ClientUiComponent param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void c(int param0, boolean param1) {
        try {
          this.field_Jb = param0;
          this.field_Qb = param0;
          if (param1) {
            this.a(-36, 44, '\177');
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void m(int param0) {
        try {
          int dupTemp$0 = 0;
          boolean stackIn_19_1 = false;
          int stackIn_32_0 = 0;
          Throwable decompiledCaughtException = null;
          int var2_int = 0;
          RuntimeException var2 = null;
          long var3_long = 0L;
          int var3 = 0;
          int var4_int = 0;
          Exception var4 = null;
          int var5 = 0;
          int var6 = 0;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            boolean decompiledFrameRemainder0 = true;
            var2_int = this.c(param0 ^ 48, AiPlanningStrategy.pointerX - (this.screenX + this.field_Pb.field_F));
            if (this.pressedButton == 1) {
              this.b(var2_int, false);
              this.field_Ib = true;
              var3_long = vi.monotonicMillis(param0 - 95);
              stackIn_19_1 = !(250L <= var3_long - this.field_Wb);
              this.field_Nb = stackIn_19_1;
              if (this.field_Nb) {
                this.field_Jb = this.k(-1);
                this.field_Qb = this.e((byte) 109);
                if (this.field_Qb > 0 &&
                  this.field_Rb.charAt(this.field_Qb - 1) == 32) {
                  this.field_Qb = this.field_Qb - 1;
                }
                this.field_Mb = this.field_Qb;
              }
              this.field_Wb = var3_long;
            } else {
              if (ro.pointerButton == 1 &&
                this.field_Ib) {
                if (!this.field_Nb) {
                  this.field_Qb = var2_int;
                } else {
                  if (var2_int >= this.field_Mb) {
                    this.field_Qb = var2_int;
                  } else {
                    if (this.field_Jb >= var2_int) {
                      this.field_Qb = var2_int;
                    } else {
                      var2_int = this.field_Mb;
                      this.field_Qb = var2_int;
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_Ib = false;
              }
            }
            if (!this.field_Y) {
              dupTemp$0 = this.field_Rb.length();
              this.field_Jb = dupTemp$0;
              this.field_Qb = dupTemp$0;
            }
            this.field_Ob.x = this.field_Pb.font.a(this.field_Rb.toString().substring(param0, this.field_Qb));
            if (this.field_Jb == this.field_Qb) {
              this.field_Xb.setBounds(this.field_Kb, -20500, 0, 2, this.field_Ob.x);
            } else {
              var3 = this.field_Pb.x + this.field_Pb.font.a(this.field_Rb.toString().substring(0, this.field_Jb));
              if (this.field_Ob.x <= var3) {
                stackIn_32_0 = this.field_Ob.x;
              } else {
                stackIn_32_0 = var3;
              }
              var4_int = stackIn_32_0;
              var5 = Math.abs(var3 - this.field_Ob.x);
              this.field_Xb.setBounds(this.field_Kb, param0 - 20500, var5, 2, var4_int + this.field_Pb.field_F);
            }
            if (this.field_Sb != null) {
              if (this.field_Sb.field_g == 0) {
                return;
              }
              var7 = (java.awt.datatransfer.Transferable) (this.field_Sb.field_f);
              try {
                var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.l(32);
                this.a((byte) 90, var8);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_Sb = null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.F(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (~this.field_Qb == param0) {
            stackIn_3_0 = this.field_Qb;
            return stackIn_3_0;
          }
          for (var2_int = this.field_Qb - 1; 0 < var2_int; var2_int--) {
            if (!wr.a(this.field_Rb.charAt(-1 + var2_int), (byte) 95)) {
              continue;
            }
            break;
          }
          stackIn_10_0 = var2_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.J(" + param0 + ')');
        }
    }

    private final int e(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 109) {
            this.field_Ib = false;
          }
          var2_int = this.field_Rb.length();
          if (this.field_Qb == var2_int) {
            stackIn_5_0 = this.field_Qb;
            return stackIn_5_0;
          }
          for (var3 = 1 + this.field_Qb; var2_int > var3; var3++) {
            if (!wr.a(this.field_Rb.charAt(var3 - 1), (byte) 95)) {
              continue;
            }
            break;
          }
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.B(" + param0 + ')');
        }
    }

    static {
        field_Vb = new int[][]{new int[]{48, 48}, new int[]{144, 0}, new int[]{0, 0}, new int[]{0, 176}, new int[]{32, 0}, new int[]{64, 64}};
    }
}
