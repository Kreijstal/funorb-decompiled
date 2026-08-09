/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae extends bp {
    static String field_w;
    static String field_v;
    private hi field_t;
    static String field_x;
    static String field_s;
    static kl field_u;

    final void c(int param0) {
        if (param0 != -5758) {
            this.d((byte) 55);
        }
        if (null != this.field_t) {
            this.field_t.c((byte) -45);
        }
    }

    final static void a(int param0, int param1) {
        bv var2 = vl.field_n;
        var2.h(32161, param1);
        var2.b(1, 2);
        var2.b(param0 + -895, 4);
        var2.b(1, gm.f(3));
        if (param0 != 896) {
            field_s = (String) null;
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            int var4_int = 0;
            RuntimeException var4_ref = null;
            jf var5 = null;
            IOException var5_ref = null;
            Exception var6 = null;
            int var7 = 0;
            var7 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == this.field_t) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        this.field_t.c((byte) -45);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_t = null;
                    break L1;
                  }
                }
                this.field_t = (hi) (param0);
                this.d((byte) 116);
                this.a(82, param1);
                this.field_a = null;
                var4_int = -66 / ((param2 - 25) / 57);
                this.field_h.field_q = 0;
                L4: while (true) {
                  var5 = (jf) ((Object) this.field_n.b(11));
                  if (var5 == null) {
                    L5: while (true) {
                      var5 = (jf) ((Object) this.field_g.b(11));
                      if (var5 != null) {
                        this.field_f.a(var5, false);
                        continue L5;
                      } else {
                        L6: {
                          if (-1 == (this.field_i ^ -1)) {
                            break L6;
                          } else {
                            try {
                              L7: {
                                this.field_o.field_q = 0;
                                this.field_o.b(1, 4);
                                this.field_o.b(1, (int) this.field_i);
                                this.field_o.a((byte) -59, 0);
                                this.field_t.a(this.field_o.field_o, (byte) 20, 0, this.field_o.field_o.length);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var5_ref = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_t.c((byte) -45);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var6 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_q = this.field_q + 1;
                                this.field_t = null;
                                this.field_p = -2;
                                break L8;
                              }
                            }
                            break L6;
                          }
                        }
                        this.field_l = 0;
                        this.field_r = vi.b(80);
                        break L0;
                      }
                    }
                  } else {
                    this.field_b.a(var5, false);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_24_0 = (RuntimeException) (var4_ref);

                stackIn_24_1 = new StringBuilder().append("ae.K(");

                if (param0 == null) {
                  stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "null";
                  break L11;
                } else {
                  stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "{...}";
                  break L11;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(int param0) {
        field_s = null;
        field_v = null;
        field_u = null;
        field_x = null;
        if (param0 != -4096) {
            field_w = (String) null;
        }
        field_w = null;
    }

    final static void a(long param0, int param1) {
        try {
            try {
                Thread.sleep(param0);
            } catch (InterruptedException interruptedException) {
            }
            if (param1 <= 3) {
                ae.b(90, 21);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ae() {
    }

    final boolean a(boolean param0) {
        try {
            int stackIn_60_0 = 0;
            int stackIn_76_0 = 0;
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            jf var2 = null;
            int var2_int = 0;
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
            jf var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            L0: {
              var16 = ArmiesOfGielinor.field_M ? 1 : 0;
              if (null == this.field_t) {
                break L0;
              } else {
                L1: {
                  var2_long = vi.b(-75);
                  var4 = (int)(-this.field_r + var2_long);
                  this.field_r = var2_long;
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_l = this.field_l + var4;
                if (30000 < this.field_l) {
                  try {
                    L2: {
                      this.field_t.c((byte) -45);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_t = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (this.field_t != null) {
              try {
                L4: {
                  this.field_t.a(param0);
                  var2 = (jf) ((Object) this.field_b.a((byte) -117));
                  L5: while (true) {
                    if (var2 == null) {
                      var2 = (jf) ((Object) this.field_f.a((byte) -123));
                      L6: while (true) {
                        if (var2 == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = this.field_t.d((byte) 43);
                                if (var3_int < 0) {
                                  throw new IOException();
                                } else {
                                  if (var3_int != 0) {
                                    L9: {
                                      this.field_l = 0;
                                      var4 = 0;
                                      if (this.field_a != null) {
                                        if (this.field_a.field_F != 0) {
                                          break L9;
                                        } else {
                                          var4 = 1;
                                          break L9;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if ((var4 ^ -1) < -1) {
                                        L11: {
                                          var5 = -this.field_h.field_q + var4;
                                          if (var5 <= var3_int) {
                                            break L11;
                                          } else {
                                            var5 = var3_int;
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          this.field_t.a(0, this.field_h.field_q, var5, this.field_h.field_o);
                                          if (0 != this.field_i) {
                                            var6 = 0;
                                            L13: while (true) {
                                              if (var6 >= var5) {
                                                break L12;
                                              } else {
                                                this.field_h.field_o[this.field_h.field_q - -var6] = (byte)kf.b((int) this.field_h.field_o[this.field_h.field_q + var6], (int) this.field_i);
                                                var6++;
                                                continue L13;
                                              }
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                        this.field_h.field_q = this.field_h.field_q + var5;
                                        if (var4 > this.field_h.field_q) {
                                          break L10;
                                        } else {
                                          if (null == this.field_a) {
                                            L14: {
                                              this.field_h.field_q = 0;
                                              var6 = this.field_h.k(0);
                                              var7 = this.field_h.i(1);
                                              var8 = this.field_h.k(0);
                                              var9 = this.field_h.i(1);
                                              var10 = 127 & var8;
                                              if (-1 == (var8 & 128 ^ -1)) {
                                                stackIn_60_0 = 0;
                                                break L14;
                                              } else {
                                                stackIn_60_0 = 1;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              var11 = stackIn_60_0;
                                              var12 = (long)var7 + ((long)var6 << -1036793568);
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (jf) ((Object) this.field_g.a((byte) -110));
                                                L16: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (var12 != var14_ref.field_q) {
                                                      var14_ref = (jf) ((Object) this.field_g.c(24));
                                                      continue L16;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (jf) ((Object) this.field_n.a((byte) -106));
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (var12 != var14_ref.field_q) {
                                                      var14_ref = (jf) ((Object) this.field_n.c(24));
                                                      continue L17;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              L18: {
                                                this.field_a = var14_ref;
                                                if (var10 == 0) {
                                                  stackIn_76_0 = 5;
                                                  break L18;
                                                } else {
                                                  stackIn_76_0 = 9;
                                                  break L18;
                                                }
                                              }
                                              var15 = stackIn_76_0;
                                              this.field_a.field_E = new vh(var15 + var9 - -this.field_a.field_B);
                                              this.field_a.field_E.b(1, var10);
                                              this.field_a.field_E.a((byte) -77, var9);
                                              this.field_h.field_q = 0;
                                              this.field_a.field_F = 10;
                                              break L10;
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            if (-1 == (this.field_a.field_F ^ -1)) {
                                              if (this.field_h.field_o[0] != -1) {
                                                this.field_a = null;
                                                break L10;
                                              } else {
                                                this.field_a.field_F = 1;
                                                this.field_h.field_q = 0;
                                                break L10;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        }
                                      } else {
                                        L19: {
                                          var5 = -this.field_a.field_B + this.field_a.field_E.field_o.length;
                                          var6 = 512 + -this.field_a.field_F;
                                          if (-this.field_a.field_E.field_q + var5 >= var6) {
                                            break L19;
                                          } else {
                                            var6 = var5 - this.field_a.field_E.field_q;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          if (var6 <= var3_int) {
                                            break L20;
                                          } else {
                                            var6 = var3_int;
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          this.field_t.a(0, this.field_a.field_E.field_q, var6, this.field_a.field_E.field_o);
                                          if (0 == this.field_i) {
                                            break L21;
                                          } else {
                                            var7 = 0;
                                            L22: while (true) {
                                              if (var6 <= var7) {
                                                break L21;
                                              } else {
                                                this.field_a.field_E.field_o[this.field_a.field_E.field_q - -var7] = (byte)kf.b((int) this.field_a.field_E.field_o[this.field_a.field_E.field_q + var7], (int) this.field_i);
                                                var7++;
                                                continue L22;
                                              }
                                            }
                                          }
                                        }
                                        this.field_a.field_F = this.field_a.field_F + var6;
                                        this.field_a.field_E.field_q = this.field_a.field_E.field_q + var6;
                                        if (this.field_a.field_E.field_q == var5) {
                                          this.field_a.c((byte) -76);
                                          this.field_a.field_x = false;
                                          this.field_a = null;
                                          break L10;
                                        } else {
                                          if ((this.field_a.field_F ^ -1) == -513) {
                                            this.field_a.field_F = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            stackIn_85_0 = 1;
                            break L4;
                          }
                        } else {
                          this.field_o.field_q = 0;
                          this.field_o.b(1, 0);
                          this.field_o.a(true, var2.field_q);
                          this.field_t.a(this.field_o.field_o, (byte) 20, 0, this.field_o.field_o.length);
                          this.field_g.a(var2, false);
                          var2 = (jf) ((Object) this.field_f.c(24));
                          continue L6;
                        }
                      }
                    } else {
                      this.field_o.field_q = 0;
                      this.field_o.b(1, 1);
                      this.field_o.a(true, var2.field_q);
                      this.field_t.a(this.field_o.field_o, (byte) 20, 0, this.field_o.field_o.length);
                      this.field_n.a(var2, false);
                      var2 = (jf) ((Object) this.field_b.c(24));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    this.field_t.c((byte) -45);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                L25: {
                  this.field_p = -2;
                  this.field_q = this.field_q + 1;
                  this.field_t = null;
                  if (-1 != (this.a(106) ^ -1)) {
                    break L25;
                  } else {
                    if (-1 == (this.b(-109) ^ -1)) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              return stackIn_85_0 != 0;
            } else {
              if (-1 != (this.a(127) ^ -1)) {
                return false;
              } else {
                if (this.b(-110) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (param0 > 70) {
              if (null == this.field_t) {
                return;
              } else {
                try {
                  L0: {
                    this.field_o.field_q = 0;
                    this.field_o.b(1, 6);
                    this.field_o.a(3, (byte) 58);
                    this.field_o.b(true, 0);
                    this.field_t.a(this.field_o.field_o, (byte) 20, 0, this.field_o.field_o.length);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L1: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L2: {
                        this.field_t.c((byte) -45);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L3: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_p = -2;
                    this.field_t = null;
                    this.field_q = this.field_q + 1;
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            vh stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            vh stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (null != this.field_t) {
              try {
                L0: {
                  L1: {
                    if (param0 > 5) {
                      break L1;
                    } else {
                      this.a(-74, true);
                      break L1;
                    }
                  }
                  L2: {
                    this.field_o.field_q = 0;
                    stackIn_6_0 = this.field_o;

                    stackIn_6_1 = 1;

                    if (!param1) {
                      stackIn_7_0 = (vh) ((Object) stackIn_6_0);
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = 3;
                      break L2;
                    } else {
                      stackIn_7_0 = (vh) ((Object) stackIn_6_0);
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = 2;
                      break L2;
                    }
                  }
                  ((vh) (Object) stackIn_7_0).b(stackIn_7_1, stackIn_7_2);
                  this.field_o.a(true, 0L);
                  this.field_t.a(this.field_o.field_o, (byte) 20, 0, this.field_o.field_o.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_t.c((byte) -45);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_q = this.field_q + 1;
                  this.field_t = null;
                  this.field_p = -2;
                  break L3;
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

    final static int b(int param0, int param1) {
        param0 = param0 & 8191;
        if (param1 != 100) {
            field_v = (String) null;
        }
        if (param0 < 4096) {
            return (param0 ^ -1) <= -2049 ? e.field_a[-param0 + 4096] : e.field_a[param0];
        }
        return (param0 ^ -1) > -6145 ? -e.field_a[-4096 + param0] : -e.field_a[8192 - param0];
    }

    final void b(byte param0) {
        if (param0 != 4) {
            return;
        }
        try {
            this.field_t.c((byte) -45);
        } catch (Exception exception) {
        }
        this.field_t = null;
        this.field_p = -1;
        this.field_q = this.field_q + 1;
        this.field_i = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static void a(byte param0, wk[] param1, wk param2) {
        try {
            vg.field_q = param1;
            vg.field_q[0].i();
            vg.field_q[1].i();
            tr.field_z = param2;
            ac.field_m = vg.field_q[0].field_v;
            if (param0 < 118) {
                field_x = (String) null;
            }
            cm.field_b = vg.field_q[0].field_y;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ae.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "This can be used from turn <%0> onwards.";
        field_x = "Click on the gold-rimmed icons to navigate through the equipment.";
        field_v = "Show all private chat";
        field_s = "Service unavailable";
    }
}
