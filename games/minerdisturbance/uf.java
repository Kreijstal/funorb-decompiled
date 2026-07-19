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
        if (!(this.field_s == null)) {
            this.field_s.b(122);
        }
        int var2 = 90 % ((param0 - -57) / 40);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                      if (param0 == 13) {
                        break L2;
                      } else {
                        field_u = (String) null;
                        break L2;
                      }
                    }
                    param1.getAppletContext().showDocument(nn.a(110, param1, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("uf.K(").append(param0).append(',');
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
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ee var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
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
            int stackIn_44_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_82_0 = 0;
            L0: {
              var16 = MinerDisturbance.field_ab;
              if (this.field_s != null) {
                L1: {
                  var2_long = sf.a((byte) 103);
                  var4 = (int)(var2_long + -this.field_e);
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_e = var2_long;
                this.field_d = this.field_d + var4;
                if (this.field_d <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      this.field_s.b(91);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_s = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null != this.field_s) {
              try {
                L4: {
                  this.field_s.a((byte) 124);
                  var2_ref = (ee) ((Object) this.field_n.a(87));
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (ee) ((Object) this.field_l.a(117));
                      L6: while (true) {
                        if (var2_ref == null) {
                          var3_int = 96 / ((param0 - 52) / 60);
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = this.field_s.c(0);
                                if ((var3_int ^ -1) > -1) {
                                  throw new IOException();
                                } else {
                                  if (-1 == (var3_int ^ -1)) {
                                    break L8;
                                  } else {
                                    L9: {
                                      this.field_d = 0;
                                      var4 = 0;
                                      if (this.field_c != null) {
                                        if (0 == this.field_c.field_D) {
                                          var4 = 1;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if ((var4 ^ -1) >= -1) {
                                        L11: {
                                          var5 = this.field_c.field_G.field_u.length + -this.field_c.field_I;
                                          var6 = 512 - this.field_c.field_D;
                                          if (var6 > var5 + -this.field_c.field_G.field_o) {
                                            var6 = var5 + -this.field_c.field_G.field_o;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (var6 > var3_int) {
                                            var6 = var3_int;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          this.field_s.a(false, this.field_c.field_G.field_u, this.field_c.field_G.field_o, var6);
                                          if (-1 != (this.field_b ^ -1)) {
                                            var17 = 0;
                                            var7 = var17;
                                            L14: while (true) {
                                              if (var17 >= var6) {
                                                break L13;
                                              } else {
                                                this.field_c.field_G.field_u[this.field_c.field_G.field_o - -var17] = (byte)eg.a((int) this.field_c.field_G.field_u[this.field_c.field_G.field_o + var17], (int) this.field_b);
                                                var17++;
                                                continue L14;
                                              }
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                        this.field_c.field_D = this.field_c.field_D + var6;
                                        this.field_c.field_G.field_o = this.field_c.field_G.field_o + var6;
                                        if (this.field_c.field_G.field_o == var5) {
                                          this.field_c.a((byte) -119);
                                          this.field_c.field_C = false;
                                          this.field_c = null;
                                          break L10;
                                        } else {
                                          if ((this.field_c.field_D ^ -1) == -513) {
                                            this.field_c.field_D = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      } else {
                                        L15: {
                                          var5 = var4 - this.field_a.field_o;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          this.field_s.a(false, this.field_a.field_u, this.field_a.field_o, var5);
                                          if (this.field_b == 0) {
                                            break L16;
                                          } else {
                                            var6 = 0;
                                            L17: while (true) {
                                              if (var5 <= var6) {
                                                break L16;
                                              } else {
                                                this.field_a.field_u[this.field_a.field_o + var6] = (byte)eg.a((int) this.field_a.field_u[this.field_a.field_o + var6], (int) this.field_b);
                                                var6++;
                                                continue L17;
                                              }
                                            }
                                          }
                                        }
                                        this.field_a.field_o = this.field_a.field_o + var5;
                                        if (this.field_a.field_o < var4) {
                                          break L10;
                                        } else {
                                          if (null != this.field_c) {
                                            if (this.field_c.field_D != 0) {
                                              throw new IOException();
                                            } else {
                                              if (this.field_a.field_u[0] == -1) {
                                                this.field_a.field_o = 0;
                                                this.field_c.field_D = 1;
                                                break L10;
                                              } else {
                                                this.field_c = null;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            L18: {
                                              this.field_a.field_o = 0;
                                              var6 = this.field_a.d((byte) -54);
                                              var7 = this.field_a.b((byte) 49);
                                              var8 = this.field_a.d((byte) -54);
                                              var9 = this.field_a.b((byte) 83);
                                              var10 = var8 & 127;
                                              if ((128 & var8) == 0) {
                                                stackOut_43_0 = 0;
                                                stackIn_44_0 = stackOut_43_0;
                                                break L18;
                                              } else {
                                                stackOut_42_0 = 1;
                                                stackIn_44_0 = stackOut_42_0;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              var11 = stackIn_44_0;
                                              var12 = ((long)var6 << 430441184) - -(long)var7;
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (ee) ((Object) this.field_m.a(-123));
                                                L20: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (var14_ref.field_p == var12) {
                                                      break L19;
                                                    } else {
                                                      var14_ref = (ee) ((Object) this.field_m.d(-128));
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (ee) ((Object) this.field_i.a(-78));
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (var14_ref.field_p != var12) {
                                                      var14_ref = (ee) ((Object) this.field_i.d(126));
                                                      continue L21;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              L22: {
                                                if (-1 == (var10 ^ -1)) {
                                                  stackOut_58_0 = 5;
                                                  stackIn_59_0 = stackOut_58_0;
                                                  break L22;
                                                } else {
                                                  stackOut_57_0 = 9;
                                                  stackIn_59_0 = stackOut_57_0;
                                                  break L22;
                                                }
                                              }
                                              var15 = stackIn_59_0;
                                              this.field_c = var14_ref;
                                              this.field_c.field_G = new sb(this.field_c.field_I + var15 + var9);
                                              this.field_c.field_G.c(var10, 25564);
                                              this.field_c.field_G.a((byte) 92, var9);
                                              this.field_a.field_o = 0;
                                              this.field_c.field_D = 10;
                                              break L10;
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                            stackOut_82_0 = 1;
                            stackIn_83_0 = stackOut_82_0;
                            break L4;
                          }
                        } else {
                          this.field_k.field_o = 0;
                          this.field_k.c(0, 25564);
                          this.field_k.a(-82, var2_ref.field_p);
                          this.field_s.a((byte) 93, this.field_k.field_u, this.field_k.field_u.length, 0);
                          this.field_m.a(var2_ref, false);
                          var2_ref = (ee) ((Object) this.field_l.d(126));
                          continue L6;
                        }
                      }
                    } else {
                      this.field_k.field_o = 0;
                      this.field_k.c(1, 25564);
                      this.field_k.a(-107, var2_ref.field_p);
                      this.field_s.a((byte) 100, this.field_k.field_u, this.field_k.field_u.length, 0);
                      this.field_i.a(var2_ref, false);
                      var2_ref = (ee) ((Object) this.field_n.d(-68));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    this.field_s.b(122);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                this.field_s = null;
                this.field_j = -2;
                this.field_o = this.field_o + 1;
                if (this.a(-11975) != 0) {
                  return false;
                } else {
                  if (this.b(1461895584) == 0) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
              return stackIn_83_0 != 0;
            } else {
              L25: {
                if (0 != this.a(-11975)) {
                  break L25;
                } else {
                  if (this.b(1461895584) != 0) {
                    break L25;
                  } else {
                    return true;
                  }
                }
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
            Exception var4 = null;
            sb stackIn_3_0 = null;
            sb stackIn_4_0 = null;
            sb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            Throwable decompiledCaughtException = null;
            sb stackOut_2_0 = null;
            sb stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            sb stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            if (null != this.field_s) {
              try {
                L0: {
                  L1: {
                    this.field_k.field_o = 0;
                    stackOut_2_0 = this.field_k;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (param0) {
                      stackOut_4_0 = (sb) ((Object) stackIn_4_0);
                      stackOut_4_1 = 2;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L1;
                    } else {
                      stackOut_3_0 = (sb) ((Object) stackIn_3_0);
                      stackOut_3_1 = 3;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L1;
                    }
                  }
                  ((sb) (Object) stackIn_5_0).c(stackIn_5_1, 25564);
                  this.field_k.a(-116, 0L);
                  this.field_s.a((byte) 120, this.field_k.field_u, this.field_k.field_u.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_s.b(97);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_s = null;
                  this.field_o = this.field_o + 1;
                  this.field_j = -2;
                  break L2;
                }
              }
              L5: {
                if (param1 == -18232) {
                  break L5;
                } else {
                  field_w = (String[]) null;
                  break L5;
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

    private final void e(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != this.field_s) {
              try {
                L0: {
                  this.field_k.field_o = 0;
                  this.field_k.c(6, 25564);
                  this.field_k.a(3, (byte) -113);
                  this.field_k.b((byte) 124, 0);
                  this.field_s.a((byte) 107, this.field_k.field_u, this.field_k.field_u.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_s.b(101);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_o = this.field_o + 1;
                  this.field_j = -2;
                  this.field_s = null;
                  break L1;
                }
              }
              L4: {
                if (param0 <= -85) {
                  break L4;
                } else {
                  this.d(-28);
                  break L4;
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

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            ee var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            String stackIn_29_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            String stackOut_27_2 = null;
            var6 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: {
                  if (this.field_s != null) {
                    try {
                      L2: {
                        this.field_s.b(param2 + -24355);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_s = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_s = (ll) (param0);
                this.e(-101);
                this.a(param1, -18232);
                if (param2 == 24458) {
                  this.field_c = null;
                  this.field_a.field_o = 0;
                  L4: while (true) {
                    var4_ref3 = (ee) ((Object) this.field_i.c(8192));
                    if (var4_ref3 != null) {
                      this.field_n.a(var4_ref3, false);
                      continue L4;
                    } else {
                      L5: while (true) {
                        var4_ref3 = (ee) ((Object) this.field_m.c(8192));
                        if (var4_ref3 == null) {
                          L6: {
                            if (-1 != (this.field_b ^ -1)) {
                              try {
                                L7: {
                                  this.field_k.field_o = 0;
                                  this.field_k.c(4, 25564);
                                  this.field_k.c((int) this.field_b, param2 ^ 15446);
                                  this.field_k.a((byte) 105, 0);
                                  this.field_s.a((byte) 106, this.field_k.field_u, this.field_k.field_u.length, 0);
                                  break L7;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L8: {
                                  var4_ref = (IOException) (Object) decompiledCaughtException;
                                  try {
                                    L9: {
                                      this.field_s.b(95);
                                      break L9;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter2) {
                                    decompiledCaughtException = decompiledCaughtParameter2;
                                    L10: {
                                      var5 = (Exception) (Object) decompiledCaughtException;
                                      break L10;
                                    }
                                  }
                                  this.field_j = -2;
                                  this.field_s = null;
                                  this.field_o = this.field_o + 1;
                                  break L8;
                                }
                              }
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          this.field_d = 0;
                          this.field_e = sf.a((byte) -45);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_l.a(var4_ref3, false);
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_26_0 = (RuntimeException) (var4_ref2);
                stackOut_26_1 = new StringBuilder().append("uf.B(");
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                if (param0 == null) {
                  stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
                  stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
                  stackOut_28_2 = "null";
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  stackIn_29_2 = stackOut_28_2;
                  break L11;
                } else {
                  stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
                  stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
                  stackOut_27_2 = "{...}";
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_29_2 = stackOut_27_2;
                  break L11;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ',' + param2 + ')');
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
