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
        mc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        if (((bo) this).field_v == null) {
          return;
        } else {
          if (null == ((bo) this).a(0)) {
            return;
          } else {
            var2 = ((bo) this).field_w.c(false);
            var3 = 77 / ((param0 - 66) / 36);
            L0: while (true) {
              if (var2 == null) {
                return;
              } else {
                L1: {
                  var4 = (int)var2.field_c;
                  if (var4 >= 0) {
                    if (((bo) this).field_q.field_i > var4) {
                      if (((bo) this).field_q.field_m[var4] == 0) {
                        var2.b(false);
                        break L1;
                      } else {
                        L2: {
                          if (0 != ((bo) this).field_f[var4]) {
                            break L2;
                          } else {
                            ll discarded$2 = this.a(1, var4, 121);
                            break L2;
                          }
                        }
                        L3: {
                          if (-1 == ((bo) this).field_f[var4]) {
                            ll discarded$3 = this.a(2, var4, 120);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if (1 != ((bo) this).field_f[var4]) {
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
                var2 = ((bo) this).field_w.a((byte) -70);
                continue L0;
              }
            }
          }
        }
    }

    final void d(int param0) {
        if (!(null != ((bo) this).field_r)) {
            return;
        }
        ((bo) this).field_p = true;
        if (param0 != 5127) {
            field_C = null;
        }
        if (((bo) this).field_v == null) {
            ((bo) this).field_v = new je();
        }
    }

    final static void c(int param0, int param1) {
        fh.field_a = 200;
        uf.field_c = new int[3];
        n.field_L = new fj[3000];
        pl.field_d = 0;
    }

    final int a(int param0, int param1) {
        ll var3 = null;
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            t discarded$2 = ((bo) this).a(-82);
            break L0;
          }
        }
        var3 = (ll) (Object) ((bo) this).field_m.a((long)param0, (byte) -43);
        if (var3 != null) {
          return var3.a(false);
        } else {
          return 0;
        }
    }

    public static void c() {
        field_C = null;
        field_h = null;
        field_A = null;
        field_e = null;
    }

    final void e(int param0) {
        int var2_int = 0;
        ll var2 = null;
        mc var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TetraLink.field_J;
          if (((bo) this).field_v != null) {
            if (null != ((bo) this).a(0)) {
              if (!((bo) this).field_l) {
                if (((bo) this).field_p) {
                  var2_int = 1;
                  var3 = ((bo) this).field_v.c(false);
                  L1: while (true) {
                    if (var3 == null) {
                      L2: while (true) {
                        L3: {
                          if (((bo) this).field_q.field_m.length <= ((bo) this).field_o) {
                            break L3;
                          } else {
                            L4: {
                              if (0 == ((bo) this).field_q.field_m[((bo) this).field_o]) {
                                break L4;
                              } else {
                                if (!((bo) this).field_u.c(-7614)) {
                                  L5: {
                                    if (((bo) this).field_f[((bo) this).field_o] != 1) {
                                      ll discarded$4 = this.a(2, ((bo) this).field_o, 126);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  if (((bo) this).field_f[((bo) this).field_o] == 1) {
                                    break L4;
                                  } else {
                                    var3 = new mc();
                                    var3.field_c = (long)((bo) this).field_o;
                                    ((bo) this).field_v.a(var3, false);
                                    var2_int = 0;
                                    break L4;
                                  }
                                } else {
                                  var2_int = 0;
                                  break L3;
                                }
                              }
                            }
                            ((bo) this).field_o = ((bo) this).field_o + 1;
                            continue L2;
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          ((bo) this).field_p = false;
                          ((bo) this).field_o = 0;
                          break L0;
                        }
                      }
                    } else {
                      L6: {
                        var4 = (int)var3.field_c;
                        if (((bo) this).field_f[var4] == 1) {
                          break L6;
                        } else {
                          ll discarded$5 = this.a(2, var4, 125);
                          break L6;
                        }
                      }
                      L7: {
                        if (((bo) this).field_f[var4] != 1) {
                          var2_int = 0;
                          break L7;
                        } else {
                          var3.b(false);
                          break L7;
                        }
                      }
                      var3 = ((bo) this).field_v.a((byte) -70);
                      continue L1;
                    }
                  }
                } else {
                  ((bo) this).field_v = null;
                  break L0;
                }
              } else {
                var2_int = 1;
                var3 = ((bo) this).field_v.c(false);
                L8: while (true) {
                  if (var3 == null) {
                    L9: while (true) {
                      L10: {
                        if (((bo) this).field_o >= ((bo) this).field_q.field_m.length) {
                          break L10;
                        } else {
                          L11: {
                            if (-1 == ((bo) this).field_q.field_m[((bo) this).field_o]) {
                              break L11;
                            } else {
                              if (-251 > ((bo) this).field_t.field_d) {
                                L12: {
                                  if (((bo) this).field_f[((bo) this).field_o] == 0) {
                                    ll discarded$6 = this.a(1, ((bo) this).field_o, 124);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                if (((bo) this).field_f[((bo) this).field_o] == 0) {
                                  var3 = new mc();
                                  var3.field_c = (long)((bo) this).field_o;
                                  var2_int = 0;
                                  ((bo) this).field_v.a(var3, false);
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
                          ((bo) this).field_o = ((bo) this).field_o + 1;
                          continue L9;
                        }
                      }
                      if (var2_int == 0) {
                        break L0;
                      } else {
                        ((bo) this).field_o = 0;
                        ((bo) this).field_l = false;
                        break L0;
                      }
                    }
                  } else {
                    L13: {
                      var4 = (int)var3.field_c;
                      if (((bo) this).field_f[var4] == 0) {
                        ll discarded$7 = this.a(1, var4, 123);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (((bo) this).field_f[var4] == 0) {
                        var2_int = 0;
                        break L14;
                      } else {
                        var3.b(false);
                        break L14;
                      }
                    }
                    var3 = ((bo) this).field_v.a((byte) -70);
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
            ((bo) this).field_v = null;
            break L15;
          }
        }
        if (((bo) this).field_n) {
          if (k.a(0) >= ((bo) this).field_x) {
            var2 = (ll) (Object) ((bo) this).field_m.b(44);
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
                var2 = (ll) (Object) ((bo) this).field_m.a(param0 + -3);
                continue L16;
              } else {
                ((bo) this).field_x = k.a(0) + 1000L;
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
        Object var5 = null;
        L0: {
          var3 = this.a(0, param1, 121);
          if (param0 == 20396) {
            break L0;
          } else {
            var5 = null;
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
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        if (null == ((bo) this).field_q) {
          L0: {
            if (((bo) this).field_g != null) {
              break L0;
            } else {
              if (!((bo) this).field_u.b((byte) 119)) {
                ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((bo) this).field_g.field_v) {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                byte[] discarded$2 = ((bo) this).b(120, 16);
                break L1;
              }
            }
            L2: {
              var5 = ((bo) this).field_g.c(true);
              var2 = var5;
              if (((bo) this).field_g instanceof fd) {
                try {
                  L3: {
                    if (var5 != null) {
                      ((bo) this).field_q = new t(var5, ((bo) this).field_B, ((bo) this).field_z);
                      if (((bo) this).field_j == ((bo) this).field_q.field_f) {
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
                    ((bo) this).field_q = null;
                    if (((bo) this).field_u.b((byte) 119)) {
                      ((bo) this).field_g = null;
                      break L4;
                    } else {
                      ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
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
                      ((bo) this).field_q = new t(var5, ((bo) this).field_B, ((bo) this).field_z);
                      break L5;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((bo) this).field_u.b(0);
                    ((bo) this).field_q = null;
                    if (!((bo) this).field_u.b((byte) 119)) {
                      ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
                      break L6;
                    } else {
                      ((bo) this).field_g = null;
                      break L6;
                    }
                  }
                  return null;
                }
                if (((bo) this).field_k != null) {
                  fd discarded$3 = ((bo) this).field_t.a(param0 + -116, ((bo) this).field_i, var5, ((bo) this).field_k);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L7: {
              ((bo) this).field_g = null;
              if (null != ((bo) this).field_r) {
                ((bo) this).field_f = new byte[((bo) this).field_q.field_i];
                break L7;
              } else {
                break L7;
              }
            }
            return ((bo) this).field_q;
          } else {
            return null;
          }
        } else {
          return ((bo) this).field_q;
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
                field_A = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref2;
            stackOut_6_1 = new StringBuilder().append("bo.H(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L4;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, jb param5, int param6, int param7, ve param8, ve param9, int param10, int param11, ve param12, int param13, jb param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException var20 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            oi.field_a = param14;
            ko.field_u = param5;
            hh.a(param7, param11, param17, param18, -120);
            int discarded$2 = -20140;
            gj.a(param9, param6, param2);
            da.a(2, 8, param8, -120, 8, param12);
            b.a(240, 320, (byte) -66);
            int discarded$3 = -118;
            kb.a(param19, param16, param10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var20 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var20;
            stackOut_2_1 = new StringBuilder().append("bo.I(").append(240).append(44).append(320).append(44).append(param2).append(44).append(8).append(44).append(-1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param5 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param8 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param9 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param10).append(44).append(param11).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param12 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(8).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param14 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 2 + 44 + param16 + 44 + param17 + 44 + param18 + 44 + param19 + 41);
        }
    }

    private final ll a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_88_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_87_0 = null;
        L0: {
          var10 = TetraLink.field_J;
          var4 = (Object) (Object) (ll) (Object) ((bo) this).field_m.a((long)param1, (byte) -43);
          if (var4 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (((ll) var4).field_D) {
                break L0;
              } else {
                if (((ll) var4).field_v) {
                  ((ll) var4).b(false);
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
                  if (((bo) this).field_r == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((bo) this).field_t.a(((bo) this).field_r, param1, 81);
                    break L2;
                  }
                } else {
                  if (2 != param0) {
                    throw new RuntimeException();
                  } else {
                    if (((bo) this).field_r != null) {
                      if (((bo) this).field_f[param1] == -1) {
                        if (!((bo) this).field_u.c(-7614)) {
                          var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, false);
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
                  }
                }
              } else {
                L3: {
                  if (null == ((bo) this).field_r) {
                    break L3;
                  } else {
                    if (((bo) this).field_f[param1] == -1) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((bo) this).field_t.a((byte) -120, ((bo) this).field_r, param1);
                      break L2;
                    }
                  }
                }
                if (!((bo) this).field_u.b((byte) 119)) {
                  var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            ((bo) this).field_m.a((long)param1, -110, (mc) var4);
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 > 117) {
          if (!((ll) var4).field_v) {
            var5 = ((ll) var4).c(true);
            if (var4 instanceof fd) {
              try {
                L4: {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      if (var5.length > 2) {
                        co.field_r.reset();
                        co.field_r.update(var5, 0, -2 + var5.length);
                        var6_int = (int)co.field_r.getValue();
                        if (~((bo) this).field_q.field_u[param1] == ~var6_int) {
                          L6: {
                            if (((bo) this).field_q.field_e == null) {
                              break L6;
                            } else {
                              if (((bo) this).field_q.field_e[param1] == null) {
                                break L6;
                              } else {
                                var7_ref_byte__ = ((bo) this).field_q.field_e[param1];
                                var8 = qb.a(var5, (byte) -89, var5.length - 2, 0);
                                var11 = 0;
                                var9 = var11;
                                L7: while (true) {
                                  if (64 <= var11) {
                                    break L6;
                                  } else {
                                    if (~var7_ref_byte__[var11] != ~var8[var11]) {
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
                          var7 = (var5[var5.length - 1] & 255) + (65280 & var5[-2 + var5.length] << 8);
                          if (var7 != (65535 & ((bo) this).field_q.field_k[param1])) {
                            throw new RuntimeException();
                          } else {
                            L8: {
                              if (((bo) this).field_f[param1] == 1) {
                                break L8;
                              } else {
                                L9: {
                                  if (((bo) this).field_f[param1] == 0) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                ((bo) this).field_f[param1] = (byte) 1;
                                break L8;
                              }
                            }
                            L10: {
                              if (((ll) var4).field_D) {
                                break L10;
                              } else {
                                ((ll) var4).b(false);
                                break L10;
                              }
                            }
                            stackOut_87_0 = var4;
                            stackIn_88_0 = stackOut_87_0;
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
                ((bo) this).field_f[param1] = (byte) -1;
                ((ll) var4).b(false);
                if (((ll) var4).field_D) {
                  if (!((bo) this).field_u.b((byte) 119)) {
                    var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                    ((bo) this).field_m.a((long)param1, -76, (mc) var4);
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
              return (ll) (Object) stackIn_88_0;
            } else {
              try {
                L11: {
                  L12: {
                    if (var5 == null) {
                      break L12;
                    } else {
                      if (var5.length > 2) {
                        co.field_r.reset();
                        co.field_r.update(var5, 0, var5.length + -2);
                        var6_int = (int)co.field_r.getValue();
                        if (~((bo) this).field_q.field_u[param1] == ~var6_int) {
                          L13: {
                            if (((bo) this).field_q.field_e == null) {
                              break L13;
                            } else {
                              if (null == ((bo) this).field_q.field_e[param1]) {
                                break L13;
                              } else {
                                var7_ref_byte__ = ((bo) this).field_q.field_e[param1];
                                var8 = qb.a(var5, (byte) -89, -2 + var5.length, 0);
                                var9 = 0;
                                L14: while (true) {
                                  if (64 <= var9) {
                                    break L13;
                                  } else {
                                    if (var7_ref_byte__[var9] == var8[var9]) {
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
                          ((bo) this).field_u.field_h = 0;
                          ((bo) this).field_u.field_d = 0;
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
                L15: {
                  var6 = (RuntimeException) (Object) decompiledCaughtException;
                  ((bo) this).field_u.b(0);
                  ((ll) var4).b(false);
                  if (((ll) var4).field_D) {
                    if (!((bo) this).field_u.b((byte) 119)) {
                      var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                      ((bo) this).field_m.a((long)param1, -118, (mc) var4);
                      break L15;
                    } else {
                      return null;
                    }
                  } else {
                    break L15;
                  }
                }
                return null;
              }
              L16: {
                var5[var5.length - 2] = (byte)(((bo) this).field_q.field_k[param1] >>> 8);
                var5[var5.length - 1] = (byte)((bo) this).field_q.field_k[param1];
                if (null != ((bo) this).field_r) {
                  fd discarded$1 = ((bo) this).field_t.a(-49, param1, var5, ((bo) this).field_r);
                  if (((bo) this).field_f[param1] != 1) {
                    ((bo) this).field_f[param1] = (byte) 1;
                    break L16;
                  } else {
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              L17: {
                if (((ll) var4).field_D) {
                  break L17;
                } else {
                  ((ll) var4).b(false);
                  break L17;
                }
              }
              return (ll) var4;
            }
          } else {
            return null;
          }
        } else {
          return null;
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
        ((bo) this).field_m = new dj(16);
        ((bo) this).field_o = 0;
        ((bo) this).field_w = new je();
        ((bo) this).field_x = 0L;
        try {
          L0: {
            L1: {
              ((bo) this).field_i = param0;
              ((bo) this).field_r = param1;
              if (null == ((bo) this).field_r) {
                ((bo) this).field_l = false;
                break L1;
              } else {
                ((bo) this).field_l = true;
                ((bo) this).field_v = new je();
                break L1;
              }
            }
            L2: {
              ((bo) this).field_z = param6;
              ((bo) this).field_B = param5;
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
              ((bo) this).field_n = stackIn_7_1 != 0;
              ((bo) this).field_j = param7;
              ((bo) this).field_t = param4;
              ((bo) this).field_k = param2;
              ((bo) this).field_u = param3;
              if (null == ((bo) this).field_k) {
                break L3;
              } else {
                ((bo) this).field_g = (ll) (Object) ((bo) this).field_t.a((byte) 111, ((bo) this).field_k, ((bo) this).field_i);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("bo.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Next";
        field_C = new je();
        field_y = 0.0f;
    }
}
