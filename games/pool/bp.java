/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bp {
    private long field_g;
    private static int field_m;
    private int field_e;
    private static mq field_u;
    int[] field_l;
    private kd field_p;
    static boolean field_r;
    private boolean field_s;
    private int field_t;
    private long field_b;
    private long field_d;
    private kd[] field_j;
    private int field_o;
    private int field_c;
    private kd[] field_f;
    private int field_i;
    private int field_a;
    private int field_q;
    static int field_h;
    private boolean field_n;
    private int field_k;

    void b() throws Exception {
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
                field_h = param0;
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
              field_m = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void a(int param0) throws Exception {
    }

    private final void a(kd param0, int param1) {
        int var3 = param1 >> 5;
        kd var4 = ((bp) this).field_j[var3];
        if (var4 == null) {
            ((bp) this).field_f[var3] = param0;
        } else {
            var4.field_o = param0;
        }
        ((bp) this).field_j[var3] = param0;
        param0.field_m = param1;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void a() {
    }

    final static bp a(sj param0, java.awt.Component param1, int param2, int param3) {
        try {
            pg var4 = null;
            Throwable var4_ref = null;
            pg var5 = null;
            pg stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            pg stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            pg stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            pg stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            pg stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            pg stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            pg stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            pg stackOut_20_0 = null;
            if (field_h != 0) {
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
                          var5 = new pg();
                          var4 = var5;
                          stackOut_8_0 = (pg) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_r) {
                            stackOut_10_0 = (pg) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (pg) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((bp) (Object) stackIn_11_0).field_l = new int[stackIn_11_1 * stackIn_11_2];
                          ((bp) (Object) var4).field_t = param3;
                          ((bp) (Object) var4).a(param1);
                          ((bp) (Object) var4).field_a = (param3 & -1024) + 1024;
                          if (((bp) (Object) var4).field_a <= 16384) {
                            break L4;
                          } else {
                            ((bp) (Object) var4).field_a = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((bp) (Object) var4).a(((bp) (Object) var4).field_a);
                          if (field_m <= 0) {
                            break L5;
                          } else {
                            if (field_u != null) {
                              break L5;
                            } else {
                              field_u = new mq();
                              field_u.field_i = param0;
                              le discarded$2 = param0.a(102, field_m, (Runnable) (Object) field_u);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_u == null) {
                            break L6;
                          } else {
                            if (field_u.field_e[param2] == null) {
                              field_u.field_e[param2] = (bp) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (pg) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new bp();
                    }
                    return (bp) (Object) stackIn_21_0;
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

    final synchronized void a(kd param0) {
        ((bp) this).field_p = param0;
    }

    public static void c() {
        field_u = null;
    }

    final synchronized void d() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((bp) this).field_s) {
              var1 = rl.a((byte) -127);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((bp) this).field_g + 6000L) {
                      break L1;
                    } else {
                      ((bp) this).field_g = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((bp) this).field_g + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((bp) this).field_g = ((bp) this).field_g + (long)(256000 / field_h);
                      var1 = rl.a((byte) -120);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((bp) this).field_g = var1;
                  break L3;
                }
              }
              if (((bp) this).field_l != null) {
                try {
                  L4: {
                    L5: {
                      if (((bp) this).field_b == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((bp) this).field_b) {
                          ((bp) this).a(((bp) this).field_a);
                          ((bp) this).field_b = 0L;
                          ((bp) this).field_n = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((bp) this).e();
                      if (((bp) this).field_i - var3_int <= ((bp) this).field_k) {
                        break L6;
                      } else {
                        ((bp) this).field_k = ((bp) this).field_i - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((bp) this).field_t + ((bp) this).field_q;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((bp) this).field_a) {
                        break L8;
                      } else {
                        L9: {
                          ((bp) this).field_a = ((bp) this).field_a + 1024;
                          if (((bp) this).field_a <= 16384) {
                            break L9;
                          } else {
                            ((bp) this).field_a = 16384;
                            break L9;
                          }
                        }
                        ((bp) this).a();
                        ((bp) this).a(((bp) this).field_a);
                        var3_int = 0;
                        ((bp) this).field_n = true;
                        if (var4 + 256 <= ((bp) this).field_a) {
                          break L8;
                        } else {
                          var4 = ((bp) this).field_a - 256;
                          ((bp) this).field_q = var4 - ((bp) this).field_t;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((bp) this).field_d) {
                            break L11;
                          } else {
                            L12: {
                              if (((bp) this).field_n) {
                                ((bp) this).field_n = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((bp) this).field_k != 0) {
                                    break L13;
                                  } else {
                                    if (((bp) this).field_c != 0) {
                                      break L13;
                                    } else {
                                      ((bp) this).a();
                                      ((bp) this).field_b = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((bp) this).field_q = Math.min(((bp) this).field_c, ((bp) this).field_k);
                                ((bp) this).field_c = ((bp) this).field_k;
                                break L12;
                              }
                            }
                            ((bp) this).field_k = 0;
                            ((bp) this).field_d = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((bp) this).field_i = var3_int;
                        break L4;
                      } else {
                        this.a(((bp) this).field_l, 256);
                        ((bp) this).b();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((bp) this).a();
                    ((bp) this).field_b = var1 + 2000L;
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

    private final void b(int param0) {
        ((bp) this).field_o = ((bp) this).field_o - param0;
        if (((bp) this).field_o < 0) {
            ((bp) this).field_o = 0;
        }
        if (((bp) this).field_p != null) {
            ((bp) this).field_p.a(param0);
            return;
        }
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        kd var7 = null;
        int var8_int = 0;
        kd[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        kd var11 = null;
        qm var12 = null;
        int var13 = 0;
        kd var14 = null;
        kd var15 = null;
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
          qn.a(param0, 0, var3);
          ((bp) this).field_o = ((bp) this).field_o - param1;
          if (((bp) this).field_p == null) {
            break L1;
          } else {
            if (((bp) this).field_o > 0) {
              break L1;
            } else {
              ((bp) this).field_o = ((bp) this).field_o + (field_h >> 4);
              bp.b(((bp) this).field_p);
              this.a(((bp) this).field_p, ((bp) this).field_p.c());
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
                            var5 = var5 & (1 << var7_int ^ -1);
                            var10 = null;
                            var11 = ((bp) this).field_f[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_n;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_l <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_o;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_l = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_l = var12.field_l + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((bp) this).field_e) {
                                  L10: {
                                    var14 = var11.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_m;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11.b();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_o;
                                    var11.field_o = null;
                                    if (var10 != null) {
                                      ((kd) var10).field_o = var15;
                                      break L12;
                                    } else {
                                      ((bp) this).field_f[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((bp) this).field_j[var7_int] = (kd) var10;
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
                    var7 = ((bp) this).field_f[var6];
                    var8 = ((bp) this).field_f;
                    var9 = var6;
                    ((bp) this).field_j[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_o;
                        var7.field_o = null;
                        var7 = (kd) var10;
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
          if (((bp) this).field_o >= 0) {
            break L16;
          } else {
            ((bp) this).field_o = 0;
            break L16;
          }
        }
        L17: {
          if (((bp) this).field_p == null) {
            break L17;
          } else {
            ((bp) this).field_p.a(param0, 0, param1);
            break L17;
          }
        }
        ((bp) this).field_g = rl.a((byte) -125);
    }

    private final static void b(kd param0) {
        param0.field_l = false;
        if (param0.field_n != null) {
            param0.field_n.field_l = 0;
        }
        kd var1 = param0.a();
        while (var1 != null) {
            bp.b(var1);
            var1 = param0.b();
        }
    }

    final synchronized void f() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_u == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_u.field_d = true;
                  L2: while (true) {
                    if (!field_u.field_h) {
                      field_u = null;
                      break L0;
                    } else {
                      cf.a(-127, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_u.field_e[var2] != this) {
                    break L3;
                  } else {
                    field_u.field_e[var2] = null;
                    break L3;
                  }
                }
                if (field_u.field_e[var2] != null) {
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
        ((bp) this).a();
        ((bp) this).field_l = null;
        ((bp) this).field_s = true;
    }

    int e() throws Exception {
        return ((bp) this).field_a;
    }

    bp() {
        ((bp) this).field_e = 32;
        ((bp) this).field_s = false;
        ((bp) this).field_g = rl.a((byte) -104);
        ((bp) this).field_b = 0L;
        ((bp) this).field_d = 0L;
        ((bp) this).field_c = 0;
        ((bp) this).field_o = 0;
        ((bp) this).field_j = new kd[8];
        ((bp) this).field_n = true;
        ((bp) this).field_k = 0;
        ((bp) this).field_f = new kd[8];
        ((bp) this).field_i = 0;
    }
}
