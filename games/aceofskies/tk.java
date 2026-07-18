/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tk {
    private int field_j;
    private long field_p;
    private boolean field_m;
    int[] field_e;
    private static int field_d;
    static int field_f;
    static boolean field_r;
    private rf field_n;
    private static pn field_s;
    private long field_q;
    private int field_o;
    private int field_t;
    private boolean field_c;
    private int field_h;
    private int field_k;
    private rf[] field_u;
    private int field_a;
    private int field_g;
    private long field_l;
    private int field_i;
    private rf[] field_b;

    int g() throws Exception {
        return ((tk) this).field_h;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        rf var7 = null;
        int var8_int = 0;
        rf[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        rf var11 = null;
        gs var12 = null;
        int var13 = 0;
        rf var14 = null;
        rf var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_r) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          au.a(param0, 0, var3);
          ((tk) this).field_o = ((tk) this).field_o - param1;
          if (((tk) this).field_n == null) {
            break L1;
          } else {
            if (((tk) this).field_o > 0) {
              break L1;
            } else {
              ((tk) this).field_o = ((tk) this).field_o + (field_f >> 4);
              tk.b(((tk) this).field_n);
              this.a(((tk) this).field_n, ((tk) this).field_n.c());
              var4 = 0;
              var5 = 255;
              var6 = 7;
              L2: while (true) {
                L3: {
                  if (var5 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (var6 >= 0) {
                        var7_int = var6;
                        var8_int = 0;
                        break L4;
                      } else {
                        var7_int = var6 & 3;
                        var8_int = -(var6 >> 2);
                        break L4;
                      }
                    }
                    var9 = var5 >>> var7_int & 286331153;
                    L5: while (true) {
                      if (var9 != 0) {
                        L6: {
                          if ((var9 & 1) != 0) {
                            var5 = var5 & ~(1 << var7_int);
                            var10 = null;
                            var11 = ((tk) this).field_b[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_f;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_e <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_e;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_g = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_e = var12.field_e + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((tk) this).field_j) {
                                  L10: {
                                    var14 = var11.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_h;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11.a();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_e;
                                    var11.field_e = null;
                                    if (var10 != null) {
                                      ((rf) var10).field_e = var15;
                                      break L12;
                                    } else {
                                      ((tk) this).field_b[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((tk) this).field_u[var7_int] = (rf) var10;
                                      break L13;
                                    }
                                  }
                                  var11 = var15;
                                  continue L7;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        var7_int += 4;
                        var8_int++;
                        var9 = var9 >>> 4;
                        continue L5;
                      } else {
                        var6--;
                        continue L2;
                      }
                    }
                  }
                }
                var6 = 0;
                L14: while (true) {
                  if (var6 >= 8) {
                    break L1;
                  } else {
                    var7 = ((tk) this).field_b[var6];
                    var8 = ((tk) this).field_b;
                    var9 = var6;
                    ((tk) this).field_u[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_e;
                        var7.field_e = null;
                        var7 = (rf) var10;
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L16: {
          if (((tk) this).field_o >= 0) {
            break L16;
          } else {
            ((tk) this).field_o = 0;
            break L16;
          }
        }
        L17: {
          if (((tk) this).field_n == null) {
            break L17;
          } else {
            ((tk) this).field_n.b(param0, 0, param1);
            break L17;
          }
        }
        ((tk) this).field_p = kh.a(-99);
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void h() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((tk) this).field_m) {
              var1 = kh.a(-128);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((tk) this).field_p + 6000L) {
                      break L1;
                    } else {
                      ((tk) this).field_p = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((tk) this).field_p + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((tk) this).field_p = ((tk) this).field_p + (long)(256000 / field_f);
                      var1 = kh.a(-69);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((tk) this).field_p = var1;
                  break L3;
                }
              }
              if (((tk) this).field_e != null) {
                try {
                  L4: {
                    L5: {
                      if (((tk) this).field_q == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((tk) this).field_q) {
                          ((tk) this).a(((tk) this).field_h);
                          ((tk) this).field_q = 0L;
                          ((tk) this).field_c = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((tk) this).g();
                      if (((tk) this).field_a - var3_int <= ((tk) this).field_t) {
                        break L6;
                      } else {
                        ((tk) this).field_t = ((tk) this).field_a - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((tk) this).field_i + ((tk) this).field_k;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((tk) this).field_h) {
                        break L8;
                      } else {
                        L9: {
                          ((tk) this).field_h = ((tk) this).field_h + 1024;
                          if (((tk) this).field_h <= 16384) {
                            break L9;
                          } else {
                            ((tk) this).field_h = 16384;
                            break L9;
                          }
                        }
                        ((tk) this).f();
                        ((tk) this).a(((tk) this).field_h);
                        var3_int = 0;
                        ((tk) this).field_c = true;
                        if (var4 + 256 <= ((tk) this).field_h) {
                          break L8;
                        } else {
                          var4 = ((tk) this).field_h - 256;
                          ((tk) this).field_k = var4 - ((tk) this).field_i;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((tk) this).field_l) {
                            break L11;
                          } else {
                            L12: {
                              if (((tk) this).field_c) {
                                ((tk) this).field_c = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((tk) this).field_t != 0) {
                                    break L13;
                                  } else {
                                    if (((tk) this).field_g != 0) {
                                      break L13;
                                    } else {
                                      ((tk) this).f();
                                      ((tk) this).field_q = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((tk) this).field_k = Math.min(((tk) this).field_g, ((tk) this).field_t);
                                ((tk) this).field_g = ((tk) this).field_t;
                                break L12;
                              }
                            }
                            ((tk) this).field_t = 0;
                            ((tk) this).field_l = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((tk) this).field_a = var3_int;
                        break L4;
                      } else {
                        this.a(((tk) this).field_e, 256);
                        ((tk) this).c();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((tk) this).f();
                    ((tk) this).field_q = var1 + 2000L;
                    break L14;
                  }
                }
                return;
              } else {
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

    void c() throws Exception {
    }

    private final void b(int param0) {
        ((tk) this).field_o = ((tk) this).field_o - param0;
        if (((tk) this).field_o < 0) {
            ((tk) this).field_o = 0;
        }
        if (((tk) this).field_n != null) {
            ((tk) this).field_n.a(param0);
            return;
        }
    }

    void a(int param0) throws Exception {
    }

    private final static void b(rf param0) {
        param0.field_g = false;
        if (param0.field_f != null) {
            param0.field_f.field_e = 0;
        }
        rf var1 = param0.b();
        while (var1 != null) {
            tk.b(var1);
            var1 = param0.a();
        }
    }

    private final void a(rf param0, int param1) {
        int var3 = param1 >> 5;
        rf var4 = ((tk) this).field_u[var3];
        if (var4 == null) {
            ((tk) this).field_b[var3] = param0;
        } else {
            var4.field_e = param0;
        }
        ((tk) this).field_u[var3] = param0;
        param0.field_h = param1;
    }

    final synchronized void d() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_s == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_s.field_a = true;
                  L2: while (true) {
                    if (!field_s.field_e) {
                      field_s = null;
                      break L0;
                    } else {
                      wf.a(50L, false);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_s.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_s.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_s.field_c[var2] != null) {
                  var1 = 0;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
        ((tk) this).f();
        ((tk) this).field_e = null;
        ((tk) this).field_m = true;
    }

    public static void a() {
        field_s = null;
    }

    void b() throws Exception {
    }

    final synchronized void e() {
        try {
            ((tk) this).field_c = true;
            try {
                ((tk) this).b();
            } catch (Exception exception) {
                ((tk) this).f();
                ((tk) this).field_q = kh.a(-86) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < 8000) {
            break L0;
          } else {
            if (param0 <= 48000) {
              L1: {
                field_f = param0;
                if (!param1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              field_r = stackIn_7_0 != 0;
              field_d = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final synchronized void a(rf param0) {
        ((tk) this).field_n = param0;
    }

    final static tk a(rk param0, java.awt.Component param1, int param2, int param3) {
        try {
            ug var4 = null;
            Throwable var4_ref = null;
            ug var5 = null;
            ug stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            ug stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            ug stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            ug stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            ug stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            ug stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            ug stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            ug stackOut_20_0 = null;
            if (field_f != 0) {
              L0: {
                if (param2 < 0) {
                  break L0;
                } else {
                  if (param2 < 2) {
                    L1: {
                      if (param3 >= 256) {
                        break L1;
                      } else {
                        param3 = 256;
                        break L1;
                      }
                    }
                    try {
                      L2: {
                        L3: {
                          var5 = new ug();
                          var4 = var5;
                          stackOut_8_0 = (ug) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_r) {
                            stackOut_10_0 = (ug) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (ug) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((tk) (Object) stackIn_11_0).field_e = new int[stackIn_11_1 * stackIn_11_2];
                          ((tk) (Object) var4).field_i = param3;
                          ((tk) (Object) var4).a(param1);
                          ((tk) (Object) var4).field_h = (param3 & -1024) + 1024;
                          if (((tk) (Object) var4).field_h <= 16384) {
                            break L4;
                          } else {
                            ((tk) (Object) var4).field_h = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((tk) (Object) var4).a(((tk) (Object) var4).field_h);
                          if (field_d <= 0) {
                            break L5;
                          } else {
                            if (field_s != null) {
                              break L5;
                            } else {
                              field_s = new pn();
                              field_s.field_f = param0;
                              en discarded$2 = param0.a(field_d, 1048576, (Runnable) (Object) field_s);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_s == null) {
                            break L6;
                          } else {
                            if (field_s.field_c[param2] == null) {
                              field_s.field_c[param2] = (tk) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (ug) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new tk();
                    }
                    return (tk) (Object) stackIn_21_0;
                  } else {
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            } else {
              throw new IllegalStateException();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void f() {
    }

    tk() {
        ((tk) this).field_j = 32;
        ((tk) this).field_m = false;
        ((tk) this).field_p = kh.a(-86);
        ((tk) this).field_t = 0;
        ((tk) this).field_c = true;
        ((tk) this).field_u = new rf[8];
        ((tk) this).field_g = 0;
        ((tk) this).field_q = 0L;
        ((tk) this).field_o = 0;
        ((tk) this).field_l = 0L;
        ((tk) this).field_a = 0;
        ((tk) this).field_b = new rf[8];
    }
}
