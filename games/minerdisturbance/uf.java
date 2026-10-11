/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf extends ch {
    static char[] field_q;
    static String[] field_w;
    static nm field_r;
    static String field_t;
    static gf[] field_p;
    static String field_v;
    private ll field_s;
    static String field_u;

    final void b(byte param0) {
        if (this.field_s != null) {
          this.field_s.b(122);
        }
        int var2 = 90 % ((param0 + 57) / 40);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              if (param0 != 13) {
                field_u = (String) null;
              }
              param1.getAppletContext().showDocument(nn.a(110, param1, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("uf.K(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_44_0 = 0;
          int stackIn_59_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          ee var2 = null;
          IOException var2_ref = null;
          int var3_int = 0;
          Exception var3 = null;
          int var4 = 0;
          Exception var5_ref_Exception = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          long var12 = 0L;
          Object var14 = null;
          ee var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var17 = 0;
          ee var2Lifetime1;
          int var3_intLifetime1;
          var16 = MinerDisturbance.field_ab;
          if (this.field_s != null) {
            var2_long = sf.a((byte) 103);
            var4 = (int)(var2_long - this.field_e);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_e = var2_long;
            this.field_d = this.field_d + var4;
            if (this.field_d > 30000) {
              try {
                this.field_s.b(91);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
          }
          if (null == this.field_s) {
            if (0 == this.a(-11975) &&
              this.b(1461895584) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_s.a((byte) 124);
            var2 = (ee) (this.field_n.a(87));
            while (var2 != null) {
              this.field_k.field_o = 0;
              this.field_k.c(1, 25564);
              this.field_k.a(-107, var2.field_p);
              this.field_s.a((byte) 100, this.field_k.field_u, this.field_k.field_u.length, 0);
              this.field_i.a(var2, false);
              var2 = (ee) (this.field_n.d(-68));
            }
            var2Lifetime1 = (ee) (this.field_l.a(117));
            while (var2Lifetime1 != null) {
              this.field_k.field_o = 0;
              this.field_k.c(0, 25564);
              this.field_k.a(-82, var2Lifetime1.field_p);
              this.field_s.a((byte) 93, this.field_k.field_u, this.field_k.field_u.length, 0);
              this.field_m.a(var2Lifetime1, false);
              var2Lifetime1 = (ee) (this.field_l.d(126));
            }
            var3_int = 96 / ((param0 - 52) / 60);
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_intLifetime1 = this.field_s.c(0);
              if (var3_intLifetime1 < 0) {
                throw new IOException();
              }
              if (var3_intLifetime1 != 0) {
                this.field_d = 0;
                var4 = 0;
                if (this.field_c != null) {
                  if (0 == this.field_c.field_D) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 <= 0) {
                  var5 = this.field_c.field_G.field_u.length - this.field_c.field_I;
                  var6 = 512 - this.field_c.field_D;
                  if (var6 > var5 - this.field_c.field_G.field_o) {
                    var6 = var5 - this.field_c.field_G.field_o;
                  }
                  if (var6 > var3_intLifetime1) {
                    var6 = var3_intLifetime1;
                  }
                  this.field_s.a(false, this.field_c.field_G.field_u, this.field_c.field_G.field_o, var6);
                  if (this.field_b != 0) {
                    var17 = 0;
                    var7 = var17;
                    while (var17 < var6) {
                      this.field_c.field_G.field_u[this.field_c.field_G.field_o + var17] = (byte)eg.a((int) this.field_c.field_G.field_u[this.field_c.field_G.field_o + var17], (int) this.field_b);
                      var17++;
                    }
                  }
                  this.field_c.field_D = this.field_c.field_D + var6;
                  this.field_c.field_G.field_o = this.field_c.field_G.field_o + var6;
                  if (this.field_c.field_G.field_o == var5) {
                    this.field_c.a((byte) -119);
                    this.field_c.field_C = false;
                    this.field_c = null;
                  } else {
                    if (this.field_c.field_D == 512) {
                      this.field_c.field_D = 0;
                    }
                  }
                } else {
                  var5 = var4 - this.field_a.field_o;
                  if (var3_intLifetime1 < var5) {
                    var5 = var3_intLifetime1;
                  }
                  this.field_s.a(false, this.field_a.field_u, this.field_a.field_o, var5);
                  if (this.field_b != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_a.field_u[this.field_a.field_o + var6] = (byte)eg.a((int) this.field_a.field_u[this.field_a.field_o + var6], (int) this.field_b);
                    }
                  }
                  this.field_a.field_o = this.field_a.field_o + var5;
                  if (this.field_a.field_o >= var4) {
                    if (null != this.field_c) {
                      if (this.field_c.field_D != 0) {
                        throw new IOException();
                      }
                      if (this.field_a.field_u[0] == -1) {
                        this.field_a.field_o = 0;
                        this.field_c.field_D = 1;
                      } else {
                        this.field_c = null;
                      }
                    } else {
                      this.field_a.field_o = 0;
                      var6 = this.field_a.d((byte) -54);
                      var7 = this.field_a.b((byte) 49);
                      var8 = this.field_a.d((byte) -54);
                      var9 = this.field_a.b((byte) 83);
                      var10 = var8 & 127;
                      stackIn_44_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_44_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (ee) (this.field_m.a(-123));
                        while (var14_ref != null) {
                          if (var14_ref.field_p == var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (ee) (this.field_m.d(-128));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (ee) (this.field_i.a(-78));
                        while (var14_ref != null) {
                          if (var14_ref.field_p == var12) {
                            break;
                          }
                          var14_ref = (ee) (this.field_i.d(126));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_59_0 = (var10 == 0) ? 5 : 9;
                      var15 = stackIn_59_0;
                      this.field_c = var14_ref;
                      this.field_c.field_G = new sb(this.field_c.field_I + var15 + var9);
                      this.field_c.field_G.c(var10, 25564);
                      this.field_c.field_G.a((byte) 92, var9);
                      this.field_a.field_o = 0;
                      this.field_c.field_D = 10;
                    }
                  }
                }
                continue;
              }
              break;
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.b(122);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_s = null;
            this.field_j = -2;
            this.field_o = this.field_o + 1;
            if (this.a(-11975) != 0) {
              return false;
            }
            if (this.b(1461895584) == 0) {
              return true;
            }
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0) {
        try {
          this.field_s.b(124);
        } catch (Exception exception) {
        }
        this.field_o = this.field_o + 1;
        this.field_j = -1;
        this.field_s = null;
        this.field_b = (byte)(int)(Math.random() * 255.0 + 1.0);
        if (param0 != 20) {
          this.field_s = (ll) null;
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_v = null;
        field_r = null;
        field_q = null;
        field_u = null;
        if (param0 != 200) {
          uf.f(119);
        }
        field_w = null;
        field_p = null;
    }

    private final void a(boolean param0, int param1) {
        try {
          IOException iOException = null;
          sb stackIn_4_0 = null;
          int stackIn_5_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_s) {
            return;
          }
          try {
            this.field_k.field_o = 0;
            stackIn_4_0 = this.field_k;
            if (param0) {
              stackIn_5_1 = 2;
            } else {
              stackIn_5_1 = 3;
            }
            ((sb) (Object) stackIn_4_0).c(stackIn_5_1, 25564);
            this.field_k.a(-116, 0L);
            this.field_s.a((byte) 120, this.field_k.field_u, this.field_k.field_u.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.b(97);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_s = null;
            this.field_o = this.field_o + 1;
            this.field_j = -2;
          }
          if (param1 != -18232) {
            field_w = (String[]) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_s) {
            return;
          }
          try {
            this.field_k.field_o = 0;
            this.field_k.c(6, 25564);
            this.field_k.a(3, (byte) -113);
            this.field_k.b((byte) 124, 0);
            this.field_s.a((byte) 107, this.field_k.field_u, this.field_k.field_u.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.b(101);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_o = this.field_o + 1;
            this.field_j = -2;
            this.field_s = null;
          }
          if (param0 > -85) {
            this.d(-28);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
          RuntimeException stackIn_28_0 = null;
          StringBuilder stackIn_28_1 = null;
          String stackIn_29_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          ee var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          ee var4_refLifetime1;
          var6 = MinerDisturbance.field_ab;
          try {
            if (this.field_s != null) {
              try {
                this.field_s.b(param2 - 24355);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
            this.field_s = (ll) (param0);
            this.e(-101);
            this.a(param1, -18232);
            if (param2 != 24458) {
              return;
            }
            this.field_c = null;
            this.field_a.field_o = 0;
            while (true) {
              var4_ref = (ee) (this.field_i.c(8192));
              if (var4_ref != null) {
                this.field_n.a(var4_ref, false);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (ee) (this.field_m.c(8192));
              if (var4_refLifetime1 != null) {
                this.field_l.a(var4_refLifetime1, false);
                continue;
              }
              break;
            }
            if (this.field_b != 0) {
              try {
                this.field_k.field_o = 0;
                this.field_k.c(4, 25564);
                this.field_k.c((int) this.field_b, param2 ^ 15446);
                this.field_k.a((byte) 105, 0);
                this.field_s.a((byte) 106, this.field_k.field_u, this.field_k.field_u.length, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_s.b(95);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_j = -2;
                this.field_s = null;
                this.field_o = this.field_o + 1;
              }
            }
            this.field_d = 0;
            this.field_e = sf.a((byte) -45);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_28_0 = var4_ref3;
            stackIn_28_1 = new StringBuilder().append("uf.B(");
            if (param0 == null) {
              stackIn_29_2 = "null";
            } else {
              stackIn_29_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public uf() {
    }

    static {
        field_w = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_t = "Type your age in years";
        field_q = new char[]{(char)13, (char)10};
        field_p = new gf[1000];
        field_v = "Press <img=18> to continue.";
        field_u = "The micro drill! Its ultra lightweight frame allows you to mine in mid-air or while swimming. If you're a miner on the move, make this a priority purchase.";
    }
}
