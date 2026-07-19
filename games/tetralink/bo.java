/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends hk {
    private ll field_g;
    private byte[] field_z;
    static boolean field_s;
    private ke field_t;
    private byte[] field_f;
    private sk field_r;
    static String field_h;
    private sk field_k;
    static wf field_A;
    static je field_C;
    private int field_i;
    private th field_u;
    private int field_B;
    private dj field_m;
    private int field_j;
    static ah field_e;
    static float field_y;
    private t field_q;
    private je field_v;
    private boolean field_l;
    private je field_w;
    private int field_o;
    private boolean field_p;
    private long field_x;
    private boolean field_n;

    final void b(byte param0) {
        ll discarded$2 = null;
        ll discarded$3 = null;
        mc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        if (this.field_v == null) {
          return;
        } else {
          if (null == this.a(0)) {
            return;
          } else {
            var2 = this.field_w.c(false);
            var3 = 77 / ((param0 - 66) / 36);
            L0: while (true) {
              if (var2 == null) {
                return;
              } else {
                L1: {
                  var4 = (int)var2.field_c;
                  if (-1 >= (var4 ^ -1)) {
                    if (this.field_q.field_i > var4) {
                      if (this.field_q.field_m[var4] == 0) {
                        var2.b(false);
                        break L1;
                      } else {
                        L2: {
                          if (0 != this.field_f[var4]) {
                            break L2;
                          } else {
                            discarded$2 = this.a(1, var4, 121);
                            break L2;
                          }
                        }
                        L3: {
                          if (-1 == this.field_f[var4]) {
                            discarded$3 = this.a(2, var4, 120);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if (1 != this.field_f[var4]) {
                          break L1;
                        } else {
                          var2.b(false);
                          break L1;
                        }
                      }
                    } else {
                      var2.b(false);
                      break L1;
                    }
                  } else {
                    var2.b(false);
                    break L1;
                  }
                }
                var2 = this.field_w.a((byte) -70);
                continue L0;
              }
            }
          }
        }
    }

    final void d(int param0) {
        if (!(null != this.field_r)) {
            return;
        }
        this.field_p = true;
        if (param0 != 5127) {
            field_C = (je) null;
        }
        if (this.field_v == null) {
            this.field_v = new je();
        }
    }

    final static void c(int param0, int param1) {
        fh.field_a = param0;
        uf.field_c = new int[param1];
        n.field_L = new fj[param0 * 15];
        pl.field_d = 0;
    }

    final int a(int param0, int param1) {
        t discarded$2 = null;
        ll var3 = null;
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            discarded$2 = this.a(-82);
            break L0;
          }
        }
        var3 = (ll) ((Object) this.field_m.a((long)param0, (byte) -43));
        if (var3 != null) {
          return var3.a(false);
        } else {
          return 0;
        }
    }

    public static void c(int param0) {
        field_C = null;
        field_h = null;
        if (param0 != -251) {
            return;
        }
        field_A = null;
        field_e = null;
    }

    final void e(int param0) {
        ll discarded$4 = null;
        ll discarded$5 = null;
        ll discarded$6 = null;
        ll discarded$7 = null;
        int var2_int = 0;
        ll var2 = null;
        mc var3 = null;
        int var4 = 0;
        int var5 = 0;
        mc var6 = null;
        mc var7 = null;
        L0: {
          var5 = TetraLink.field_J;
          if (this.field_v != null) {
            if (null != this.a(0)) {
              if (!this.field_l) {
                if (this.field_p) {
                  var2_int = 1;
                  var3 = this.field_v.c(false);
                  L1: while (true) {
                    if (var3 == null) {
                      L2: while (true) {
                        L3: {
                          if (this.field_q.field_m.length <= this.field_o) {
                            break L3;
                          } else {
                            L4: {
                              if (0 == this.field_q.field_m[this.field_o]) {
                                break L4;
                              } else {
                                if (!this.field_u.c(-7614)) {
                                  L5: {
                                    if (this.field_f[this.field_o] != 1) {
                                      discarded$4 = this.a(2, this.field_o, 126);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  if (-2 == (this.field_f[this.field_o] ^ -1)) {
                                    break L4;
                                  } else {
                                    var7 = new mc();
                                    var7.field_c = (long)this.field_o;
                                    this.field_v.a(var7, false);
                                    var2_int = 0;
                                    break L4;
                                  }
                                } else {
                                  var2_int = 0;
                                  break L3;
                                }
                              }
                            }
                            this.field_o = this.field_o + 1;
                            continue L2;
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          this.field_p = false;
                          this.field_o = 0;
                          break L0;
                        }
                      }
                    } else {
                      L6: {
                        var4 = (int)var3.field_c;
                        if (this.field_f[var4] == 1) {
                          break L6;
                        } else {
                          discarded$5 = this.a(2, var4, 125);
                          break L6;
                        }
                      }
                      L7: {
                        if (-2 != (this.field_f[var4] ^ -1)) {
                          var2_int = 0;
                          break L7;
                        } else {
                          var3.b(false);
                          break L7;
                        }
                      }
                      var3 = this.field_v.a((byte) -70);
                      continue L1;
                    }
                  }
                } else {
                  this.field_v = null;
                  break L0;
                }
              } else {
                var2_int = 1;
                var3 = this.field_v.c(false);
                L8: while (true) {
                  if (var3 == null) {
                    L9: while (true) {
                      L10: {
                        if (this.field_o >= this.field_q.field_m.length) {
                          break L10;
                        } else {
                          L11: {
                            if (-1 == (this.field_q.field_m[this.field_o] ^ -1)) {
                              break L11;
                            } else {
                              if (-251 < (this.field_t.field_d ^ -1)) {
                                L12: {
                                  if (this.field_f[this.field_o] == 0) {
                                    discarded$6 = this.a(1, this.field_o, 124);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                if (this.field_f[this.field_o] == 0) {
                                  var6 = new mc();
                                  var6.field_c = (long)this.field_o;
                                  var2_int = 0;
                                  this.field_v.a(var6, false);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              } else {
                                var2_int = 0;
                                break L10;
                              }
                            }
                          }
                          this.field_o = this.field_o + 1;
                          continue L9;
                        }
                      }
                      if (var2_int == 0) {
                        break L0;
                      } else {
                        this.field_o = 0;
                        this.field_l = false;
                        break L0;
                      }
                    }
                  } else {
                    L13: {
                      var4 = (int)var3.field_c;
                      if (this.field_f[var4] == 0) {
                        discarded$7 = this.a(1, var4, 123);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (this.field_f[var4] == 0) {
                        var2_int = 0;
                        break L14;
                      } else {
                        var3.b(false);
                        break L14;
                      }
                    }
                    var3 = this.field_v.a((byte) -70);
                    continue L8;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (param0 == 2) {
            break L15;
          } else {
            this.field_v = (je) null;
            break L15;
          }
        }
        if (this.field_n) {
          if (k.a(0) >= this.field_x) {
            var2 = (ll) ((Object) this.field_m.b(44));
            L16: while (true) {
              if (var2 != null) {
                L17: {
                  if (var2.field_v) {
                    break L17;
                  } else {
                    if (!var2.field_B) {
                      var2.field_B = true;
                      break L17;
                    } else {
                      if (var2.field_D) {
                        var2.b(false);
                        break L17;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                var2 = (ll) ((Object) this.field_m.a(param0 + -3));
                continue L16;
              } else {
                this.field_x = k.a(0) + 1000L;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final byte[] b(int param0, int param1) {
        ll var3 = null;
        byte[] var4 = null;
        java.awt.Canvas var5 = null;
        L0: {
          var3 = this.a(0, param1, 121);
          if (param0 == 20396) {
            break L0;
          } else {
            var5 = (java.awt.Canvas) null;
            bo.a(62, -68, (java.awt.Canvas) null, 86);
            break L0;
          }
        }
        if (var3 == null) {
          return null;
        } else {
          var4 = var3.c(true);
          var3.b(false);
          return var4;
        }
    }

    final t a(int param0) {
        byte[] discarded$2 = null;
        fd discarded$3 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        if (null == this.field_q) {
          L0: {
            if (this.field_g != null) {
              break L0;
            } else {
              if (!this.field_u.b((byte) 119)) {
                this.field_g = (ll) ((Object) this.field_u.a(false, 255, (byte) 0, this.field_i, true));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_g.field_v) {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                discarded$2 = this.b(120, 16);
                break L1;
              }
            }
            L2: {
              var7 = this.field_g.c(true);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (this.field_g instanceof fd) {
                try {
                  L3: {
                    if (var5 != null) {
                      this.field_q = new t(var7, this.field_B, this.field_z);
                      if (this.field_j == this.field_q.field_f) {
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    this.field_q = null;
                    if (this.field_u.b((byte) 119)) {
                      this.field_g = null;
                      break L4;
                    } else {
                      this.field_g = (ll) ((Object) this.field_u.a(false, 255, (byte) 0, this.field_i, true));
                      break L4;
                    }
                  }
                  return null;
                }
                break L2;
              } else {
                try {
                  L5: {
                    if (var5 != null) {
                      this.field_q = new t(var7, this.field_B, this.field_z);
                      break L5;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    this.field_u.b(0);
                    this.field_q = null;
                    if (!this.field_u.b((byte) 119)) {
                      this.field_g = (ll) ((Object) this.field_u.a(false, 255, (byte) 0, this.field_i, true));
                      break L6;
                    } else {
                      this.field_g = null;
                      break L6;
                    }
                  }
                  return null;
                }
                if (this.field_k != null) {
                  discarded$3 = this.field_t.a(param0 + -116, this.field_i, var7, this.field_k);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L7: {
              this.field_g = null;
              if (null != this.field_r) {
                this.field_f = new byte[this.field_q.field_i];
                break L7;
              } else {
                break L7;
              }
            }
            return this.field_q;
          } else {
            return null;
          }
        } else {
          return this.field_q;
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
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
                var4 = param2.getGraphics();
                pk.field_O.a(10, param0, param1, var4);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                break L2;
              }
            }
            L3: {
              if (param3 == -2) {
                break L3;
              } else {
                field_A = (wf) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4_ref2);
            stackOut_6_1 = new StringBuilder().append("bo.H(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, jb param5, int param6, int param7, ve param8, ve param9, int param10, int param11, ve param12, int param13, jb param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException var20 = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              oi.field_a = param14;
              ko.field_u = param5;
              hh.a(param7, param11, param17, param18, -120);
              gj.a(param9, param6, param2, -20140);
              da.a(param15, param3, param8, -120, param13, param12);
              if (param4 == -1) {
                break L1;
              } else {
                bo.c(-91);
                break L1;
              }
            }
            b.a(param0, param1, (byte) -66);
            kb.a(param19, param16, param10, (byte) -118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var20 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var20);
            stackOut_4_1 = new StringBuilder().append("bo.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param8 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param9 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param12 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param13).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param14 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ')');
        }
    }

    private final ll a(int param0, int param1, int param2) {
        fd discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ll var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        Object stackIn_90_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_89_0 = null;
        L0: {
          var10 = TetraLink.field_J;
          var12 = (ll) ((Object) this.field_m.a((long)param1, (byte) -43));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (var12.field_D) {
                break L0;
              } else {
                if (var12.field_v) {
                  var12.b(false);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              if (param0 != 0) {
                if (1 == param0) {
                  if (this.field_r == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_t.a(this.field_r, param1, 81);
                    break L2;
                  }
                } else {
                  if (2 == param0) {
                    if (this.field_r != null) {
                      if ((this.field_f[param1] ^ -1) == 0) {
                        if (!this.field_u.c(-7614)) {
                          var4 = this.field_u.a(false, this.field_i, (byte) 2, param1, false);
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L3: {
                  if (null == this.field_r) {
                    break L3;
                  } else {
                    if (0 == (this.field_f[param1] ^ -1)) {
                      break L3;
                    } else {
                      var4 = this.field_t.a((byte) -120, this.field_r, param1);
                      break L2;
                    }
                  }
                }
                if (!this.field_u.b((byte) 119)) {
                  var4 = this.field_u.a(false, this.field_i, (byte) 2, param1, true);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_m.a((long)param1, -110, (mc) (var4));
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 > 117) {
          if (!((ll) (var4)).field_v) {
            var18 = ((ll) (var4)).c(true);
            var13 = var18;
            var5 = var13;
            if (var4 instanceof fd) {
              try {
                L4: {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      if (var18.length > 2) {
                        co.field_r.reset();
                        co.field_r.update(var5, 0, -2 + var18.length);
                        var6_int = (int)co.field_r.getValue();
                        if (this.field_q.field_u[param1] == var6_int) {
                          L6: {
                            if (this.field_q.field_e == null) {
                              break L6;
                            } else {
                              if (this.field_q.field_e[param1] == null) {
                                break L6;
                              } else {
                                var29 = this.field_q.field_e[param1];
                                var30 = qb.a(var5, (byte) -89, var18.length - 2, 0);
                                var11 = 0;
                                var9 = var11;
                                L7: while (true) {
                                  if (64 <= var11) {
                                    break L6;
                                  } else {
                                    if (var29[var11] != var30[var11]) {
                                      throw new RuntimeException();
                                    } else {
                                      var11++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var7 = (var5[var18.length - 1] & 255) + (65280 & var5[-2 + var18.length] << -1403728376);
                          if (var7 != (65535 & this.field_q.field_k[param1])) {
                            throw new RuntimeException();
                          } else {
                            L8: {
                              if ((this.field_f[param1] ^ -1) == -2) {
                                break L8;
                              } else {
                                L9: {
                                  if (this.field_f[param1] == 0) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                this.field_f[param1] = (byte) 1;
                                break L8;
                              }
                            }
                            L10: {
                              if (((ll) (var4)).field_D) {
                                break L10;
                              } else {
                                ((ll) (var4)).b(false);
                                break L10;
                              }
                            }
                            stackOut_89_0 = var4;
                            stackIn_90_0 = stackOut_89_0;
                            break L4;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6_ref = (Exception) (Object) decompiledCaughtException;
                this.field_f[param1] = (byte)-1;
                ((ll) (var4)).b(false);
                if (((ll) (var4)).field_D) {
                  if (this.field_u.b((byte) 119)) {
                    return null;
                  } else {
                    var4 = this.field_u.a(false, this.field_i, (byte) 2, param1, true);
                    this.field_m.a((long)param1, -76, (mc) (var4));
                    return null;
                  }
                } else {
                  return null;
                }
              }
              return (ll) ((Object) stackIn_90_0);
            } else {
              try {
                L11: {
                  L12: {
                    if (var5 == null) {
                      break L12;
                    } else {
                      if (-3 > (var18.length ^ -1)) {
                        co.field_r.reset();
                        co.field_r.update(var5, 0, var18.length + -2);
                        var6_int = (int)co.field_r.getValue();
                        if (this.field_q.field_u[param1] == var6_int) {
                          L13: {
                            if (this.field_q.field_e == null) {
                              break L13;
                            } else {
                              if (null == this.field_q.field_e[param1]) {
                                break L13;
                              } else {
                                var27 = this.field_q.field_e[param1];
                                var28 = qb.a(var5, (byte) -89, -2 + var18.length, 0);
                                var9 = 0;
                                L14: while (true) {
                                  if (64 <= var9) {
                                    break L13;
                                  } else {
                                    if (var27[var9] == var28[var9]) {
                                      var9++;
                                      continue L14;
                                    } else {
                                      throw new RuntimeException();
                                    }
                                  }
                                }
                              }
                            }
                          }
                          this.field_u.field_h = 0;
                          this.field_u.field_d = 0;
                          break L11;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                this.field_u.b(0);
                ((ll) (var4)).b(false);
                if (((ll) (var4)).field_D) {
                  if (this.field_u.b((byte) 119)) {
                    return null;
                  } else {
                    var4 = this.field_u.a(false, this.field_i, (byte) 2, param1, true);
                    this.field_m.a((long)param1, -118, (mc) (var4));
                    return null;
                  }
                } else {
                  return null;
                }
              }
              L15: {
                var5[var18.length - 2] = (byte)(this.field_q.field_k[param1] >>> 929261416);
                var5[var18.length - 1] = (byte)this.field_q.field_k[param1];
                if (null != this.field_r) {
                  discarded$1 = this.field_t.a(-49, param1, var18, this.field_r);
                  if (-2 != (this.field_f[param1] ^ -1)) {
                    this.field_f[param1] = (byte) 1;
                    break L15;
                  } else {
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
              L16: {
                if (((ll) (var4)).field_D) {
                  break L16;
                } else {
                  ((ll) (var4)).b(false);
                  break L16;
                }
              }
              return (ll) (var4);
            }
          } else {
            return null;
          }
        } else {
          return (ll) null;
        }
    }

    bo(int param0, sk param1, sk param2, th param3, ke param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        this.field_m = new dj(16);
        this.field_o = 0;
        this.field_w = new je();
        this.field_x = 0L;
        try {
          L0: {
            L1: {
              this.field_i = param0;
              this.field_r = param1;
              if (null == this.field_r) {
                this.field_l = false;
                break L1;
              } else {
                this.field_l = true;
                this.field_v = new je();
                break L1;
              }
            }
            L2: {
              this.field_z = param6;
              this.field_B = param5;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((bo) (this)).field_n = stackIn_7_1 != 0;
              this.field_j = param7;
              this.field_t = param4;
              this.field_k = param2;
              this.field_u = param3;
              if (null == this.field_k) {
                break L3;
              } else {
                this.field_g = (ll) ((Object) this.field_t.a((byte) 111, this.field_k, this.field_i));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("bo.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_h = "Next";
        field_C = new je();
        field_y = 0.0f;
    }
}
