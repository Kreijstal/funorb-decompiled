/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cl extends gb {
    static int field_o;
    static nh field_p;
    static String field_q;
    static nh field_s;
    private qe field_r;
    static he[] field_n;
    static he field_t;

    final static nh[] a(String param0, vj param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        nh[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        nh[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 < -113) {
                break L1;
              } else {
                field_s = (nh) null;
                break L1;
              }
            }
            var4_int = param1.a(param0, (byte) -83);
            var5 = param1.a((byte) -99, param3, var4_int);
            stackOut_2_0 = vh.a(param1, var4_int, -114, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("cl.M(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            RuntimeException var4 = null;
            int var4_int = 0;
            Exception var5 = null;
            IOException var5_ref = null;
            cm var5_ref2 = null;
            Exception var6 = null;
            int var7 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  var4_int = 2 % ((param2 - -59) / 40);
                  if (this.field_r == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        this.field_r.b(50);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var5 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_r = null;
                    break L1;
                  }
                }
                this.field_r = (qe) (param0);
                this.e(6);
                this.a(param1, 0);
                this.field_g.field_j = 0;
                this.field_d = null;
                L4: while (true) {
                  var5_ref2 = (cm) ((Object) this.field_m.d(5518));
                  if (var5_ref2 != null) {
                    this.field_i.a(var5_ref2, 0);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var5_ref2 = (cm) ((Object) this.field_b.d(5518));
                      if (var5_ref2 == null) {
                        L6: {
                          if (this.field_a == 0) {
                            break L6;
                          } else {
                            try {
                              L7: {
                                this.field_l.field_j = 0;
                                this.field_l.c(4, (byte) -96);
                                this.field_l.c((int) this.field_a, (byte) -126);
                                this.field_l.a(0, (byte) 120);
                                this.field_r.a(this.field_l.field_h.length, -30537, this.field_l.field_h, 0);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var5_ref = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_r.b(50);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var6 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_h = -2;
                                this.field_r = null;
                                this.field_c = this.field_c + 1;
                                break L8;
                              }
                            }
                            break L6;
                          }
                        }
                        this.field_j = 0;
                        this.field_k = la.a(false);
                        break L0;
                      } else {
                        this.field_f.a(var5_ref2, 0);
                        continue L5;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) (var4);
                stackOut_22_1 = new StringBuilder().append("cl.H(");
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param0 == null) {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L11;
                } else {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L11;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(byte param0) {
        ek var1 = (ek) ((Object) hl.field_c.a((byte) -106));
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        wj.a(var1.field_i, var1.field_u, var1.field_r);
        wj.f(var1.field_j, var1.field_k, var1.field_o, var1.field_s);
        var1.field_i = null;
        if (param0 > -64) {
            field_n = (he[]) null;
        }
        tg.field_g.a(var1, 255);
    }

    public cl() {
    }

    final boolean b(boolean param0) {
        try {
            nh[] discarded$1 = null;
            IOException var2 = null;
            long var2_long = 0L;
            cm var2_ref = null;
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
            cm var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            String var17 = null;
            int stackIn_65_0 = 0;
            hl stackIn_67_0 = null;
            hl stackIn_68_0 = null;
            hl stackIn_69_0 = null;
            int stackIn_69_1 = 0;
            int stackIn_84_0 = 0;
            int stackIn_93_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_64_0 = 0;
            int stackOut_63_0 = 0;
            hl stackOut_66_0 = null;
            hl stackOut_68_0 = null;
            int stackOut_68_1 = 0;
            hl stackOut_67_0 = null;
            int stackOut_67_1 = 0;
            int stackOut_83_0 = 0;
            int stackOut_82_0 = 0;
            int stackOut_92_0 = 0;
            L0: {
              var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
              if (null == this.field_r) {
                break L0;
              } else {
                L1: {
                  var2_long = la.a(param0);
                  var4 = (int)(-this.field_k + var2_long);
                  this.field_k = var2_long;
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_j = this.field_j + var4;
                if (30000 >= this.field_j) {
                  break L0;
                } else {
                  try {
                    L2: {
                      this.field_r.b(50);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_r = null;
                  break L0;
                }
              }
            }
            if (null != this.field_r) {
              try {
                L4: {
                  this.field_r.b((byte) -13);
                  var2_ref = (cm) ((Object) this.field_i.a(true));
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (cm) ((Object) this.field_f.a(true));
                      L6: while (true) {
                        if (var2_ref == null) {
                          L7: {
                            if (!param0) {
                              break L7;
                            } else {
                              var17 = (String) null;
                              discarded$1 = cl.a((String) null, (vj) null, 114, (String) null);
                              break L7;
                            }
                          }
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if ((var2_int ^ -1) <= -101) {
                                break L9;
                              } else {
                                var3_int = this.field_r.a((byte) -122);
                                if (-1 < (var3_int ^ -1)) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L9;
                                  } else {
                                    L10: {
                                      this.field_j = 0;
                                      var4 = 0;
                                      if (null == this.field_d) {
                                        var4 = 10;
                                        break L10;
                                      } else {
                                        if (this.field_d.field_O == 0) {
                                          var4 = 1;
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (0 < var4) {
                                        L12: {
                                          var5 = -this.field_g.field_j + var4;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          this.field_r.a((byte) -14, this.field_g.field_h, this.field_g.field_j, var5);
                                          if (this.field_a != 0) {
                                            var6 = 0;
                                            L14: while (true) {
                                              if (var5 <= var6) {
                                                break L13;
                                              } else {
                                                this.field_g.field_h[this.field_g.field_j + var6] = (byte)qk.a((int) this.field_g.field_h[this.field_g.field_j + var6], (int) this.field_a);
                                                var6++;
                                                continue L14;
                                              }
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                        this.field_g.field_j = this.field_g.field_j + var5;
                                        if (var4 <= this.field_g.field_j) {
                                          if (null != this.field_d) {
                                            if (0 == this.field_d.field_O) {
                                              if (this.field_g.field_h[0] != -1) {
                                                this.field_d = null;
                                                break L11;
                                              } else {
                                                this.field_d.field_O = 1;
                                                this.field_g.field_j = 0;
                                                break L11;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L15: {
                                              this.field_g.field_j = 0;
                                              var6 = this.field_g.l(31760);
                                              var7 = this.field_g.h(-121);
                                              var8 = this.field_g.l(31760);
                                              var9 = this.field_g.h(119);
                                              var10 = 127 & var8;
                                              if (-1 == (128 & var8 ^ -1)) {
                                                stackOut_64_0 = 0;
                                                stackIn_65_0 = stackOut_64_0;
                                                break L15;
                                              } else {
                                                stackOut_63_0 = 1;
                                                stackIn_65_0 = stackOut_63_0;
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              var11 = stackIn_65_0;
                                              var12 = (long)var7 + ((long)var6 << -247226336);
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (cm) ((Object) this.field_b.a(true));
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if (var12 != var14_ref.field_t) {
                                                      var14_ref = (cm) ((Object) this.field_b.c(114));
                                                      continue L17;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                              } else {
                                                L18: {
                                                  stackOut_66_0 = this.field_m;
                                                  stackIn_68_0 = stackOut_66_0;
                                                  stackIn_67_0 = stackOut_66_0;
                                                  if (param0) {
                                                    stackOut_68_0 = (hl) ((Object) stackIn_68_0);
                                                    stackOut_68_1 = 0;
                                                    stackIn_69_0 = stackOut_68_0;
                                                    stackIn_69_1 = stackOut_68_1;
                                                    break L18;
                                                  } else {
                                                    stackOut_67_0 = (hl) ((Object) stackIn_67_0);
                                                    stackOut_67_1 = 1;
                                                    stackIn_69_0 = stackOut_67_0;
                                                    stackIn_69_1 = stackOut_67_1;
                                                    break L18;
                                                  }
                                                }
                                                var14_ref = (cm) ((Object) ((hl) (Object) stackIn_69_0).a(stackIn_69_1 != 0));
                                                L19: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if (var14_ref.field_t == var12) {
                                                      break L16;
                                                    } else {
                                                      var14_ref = (cm) ((Object) this.field_m.c(89));
                                                      continue L19;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L20: {
                                                this.field_d = var14_ref;
                                                if (var10 != 0) {
                                                  stackOut_83_0 = 9;
                                                  stackIn_84_0 = stackOut_83_0;
                                                  break L20;
                                                } else {
                                                  stackOut_82_0 = 5;
                                                  stackIn_84_0 = stackOut_82_0;
                                                  break L20;
                                                }
                                              }
                                              var15 = stackIn_84_0;
                                              this.field_d.field_K = new od(this.field_d.field_N + var9 + var15);
                                              this.field_d.field_K.c(var10, (byte) -99);
                                              this.field_d.field_K.a(var9, (byte) 107);
                                              this.field_g.field_j = 0;
                                              this.field_d.field_O = 10;
                                              break L11;
                                            }
                                          }
                                        } else {
                                          break L11;
                                        }
                                      } else {
                                        L21: {
                                          var5 = -this.field_d.field_N + this.field_d.field_K.field_h.length;
                                          var6 = -this.field_d.field_O + 512;
                                          if (-this.field_d.field_K.field_j + var5 < var6) {
                                            var6 = -this.field_d.field_K.field_j + var5;
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          if (var3_int < var6) {
                                            var6 = var3_int;
                                            break L22;
                                          } else {
                                            break L22;
                                          }
                                        }
                                        L23: {
                                          this.field_r.a((byte) -14, this.field_d.field_K.field_h, this.field_d.field_K.field_j, var6);
                                          if (this.field_a != 0) {
                                            var7 = 0;
                                            L24: while (true) {
                                              if (var6 <= var7) {
                                                break L23;
                                              } else {
                                                this.field_d.field_K.field_h[this.field_d.field_K.field_j + var7] = (byte)qk.a((int) this.field_d.field_K.field_h[this.field_d.field_K.field_j + var7], (int) this.field_a);
                                                var7++;
                                                continue L24;
                                              }
                                            }
                                          } else {
                                            break L23;
                                          }
                                        }
                                        this.field_d.field_K.field_j = this.field_d.field_K.field_j + var6;
                                        this.field_d.field_O = this.field_d.field_O + var6;
                                        if (this.field_d.field_K.field_j != var5) {
                                          if ((this.field_d.field_O ^ -1) == -513) {
                                            this.field_d.field_O = 0;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          this.field_d.f(64);
                                          this.field_d.field_u = false;
                                          this.field_d = null;
                                          break L11;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                            stackOut_92_0 = 1;
                            stackIn_93_0 = stackOut_92_0;
                            break L4;
                          }
                        } else {
                          this.field_l.field_j = 0;
                          this.field_l.c(0, (byte) -90);
                          this.field_l.a(1992910808, var2_ref.field_t);
                          this.field_r.a(this.field_l.field_h.length, -30537, this.field_l.field_h, 0);
                          this.field_b.a(var2_ref, 0);
                          var2_ref = (cm) ((Object) this.field_f.c(-124));
                          continue L6;
                        }
                      }
                    } else {
                      this.field_l.field_j = 0;
                      this.field_l.c(1, (byte) -117);
                      this.field_l.a(1992910808, var2_ref.field_t);
                      this.field_r.a(this.field_l.field_h.length, -30537, this.field_l.field_h, 0);
                      this.field_m.a(var2_ref, 0);
                      var2_ref = (cm) ((Object) this.field_i.c(91));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L25: {
                    this.field_r.b(50);
                    break L25;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L26: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L26;
                  }
                }
                L27: {
                  this.field_c = this.field_c + 1;
                  this.field_h = -2;
                  this.field_r = null;
                  if (0 != this.c((byte) -82)) {
                    break L27;
                  } else {
                    if (-1 != (this.a(105) ^ -1)) {
                      break L27;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_93_0 != 0;
            } else {
              if (this.c((byte) -123) != 0) {
                return false;
              } else {
                if (0 == this.a(114)) {
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

    public static void d(int param0) {
        field_p = null;
        field_t = null;
        field_n = null;
        field_q = null;
        if (param0 != 0) {
            field_p = (nh) null;
        }
        field_s = null;
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            od stackIn_3_0 = null;
            od stackIn_4_0 = null;
            od stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            Throwable decompiledCaughtException = null;
            od stackOut_2_0 = null;
            od stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            od stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            if (this.field_r != null) {
              try {
                L0: {
                  L1: {
                    this.field_l.field_j = param1;
                    stackOut_2_0 = this.field_l;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (param0) {
                      stackOut_4_0 = (od) ((Object) stackIn_4_0);
                      stackOut_4_1 = 2;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L1;
                    } else {
                      stackOut_3_0 = (od) ((Object) stackIn_3_0);
                      stackOut_3_1 = 3;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L1;
                    }
                  }
                  ((od) (Object) stackIn_5_0).c(stackIn_5_1, (byte) -96);
                  this.field_l.a(1992910808, 0L);
                  this.field_r.a(this.field_l.field_h.length, -30537, this.field_l.field_h, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_r.b(50);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_h = -2;
                  this.field_c = this.field_c + 1;
                  this.field_r = null;
                  break L2;
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

    final void b(byte param0) {
        try {
            this.field_r.b(50);
        } catch (Exception exception) {
        }
        if (param0 != 122) {
            return;
        }
        this.field_c = this.field_c + 1;
        this.field_r = null;
        this.field_h = -1;
        this.field_a = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final void a(byte param0) {
        int var2 = -8 / ((65 - param0) / 58);
        if (!(null == this.field_r)) {
            this.field_r.b(50);
        }
    }

    private final void e(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != this.field_r) {
              try {
                L0: {
                  this.field_l.field_j = 0;
                  this.field_l.c(param0, (byte) -92);
                  this.field_l.a(3, false);
                  this.field_l.c(0, -17402);
                  this.field_r.a(this.field_l.field_h.length, param0 + -30543, this.field_l.field_h, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_r.b(50);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_r = null;
                  this.field_h = -2;
                  this.field_c = this.field_c + 1;
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

    static {
        field_s = null;
        field_q = "Not yet achieved";
        field_p = null;
    }
}
